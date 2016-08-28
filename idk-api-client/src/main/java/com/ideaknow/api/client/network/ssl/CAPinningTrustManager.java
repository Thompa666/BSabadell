package com.ideaknow.api.client.network.ssl;

import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.*;

/**
 * This TrustManager performs an SSL pinnning of a group of selected CAs on top of the system
 * normal validation.
 */
public class CAPinningTrustManager implements X509TrustManager {
    /**
     * Allowed chars in hexadecimal value
     */
    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

    // These pins are just the sha1 of the certificates' Subject Public Key Info, DER encoded.

    // PIN for certificate: OU=GlobalSign Root CA - R2, O=GlobalSign, CN=GlobalSign
    private static final String PIN_GLOBALSIGN = "a5068a78cf84bd7432dd58f965eb3a55e7c780dc";

    // PIN for certificate: OU=GlobalSign ECC Root CA - R4, O=GlobalSign, CN=GlobalSign
    private static final String PIN_GLOBALSIGN_ECC_R4 = "2856843ab6d54a8ba3bbae9f8a7773745ea55ca8";

    // PIN for certificate: OU=GlobalSign ECC Root CA - R5, O=GlobalSign, CN=GlobalSign
    private static final String PIN_GLOBALSIGN_R5 = "4c75d4858062aaa9449c66151e6c5813053a9c72";

    // PIN for certificate: C=BE, O=GlobalSign nv-sa, OU=Root CA, CN=GlobalSign Root CA
    private static final String PIN_GLOBALSIGN_NV_SA = "87dbd45fb0928d4e1df81567e7f2abafd62b6775";

    // PIN for certificate: C=US, O=thawte, Inc., OU=Certification Services Division,
    // OU=(c) 2006 thawte, Inc. - For authorized use only, CN=thawte Primary Root CA
    private static final String PIN_THAWTE = "6ccabd7db47e94a5759901b6a7dfd45d1c091ccc";

    // PIN for certificate: C=US, O=thawte, Inc., OU=Certification Services Division,
    // OU=(c) 2008 thawte, Inc. - For authorized use only, CN=thawte Primary Root CA - G3
    private static final String PIN_THAWTE_G3 = "ab7688f4e5e138c9e95017cdcdb31817b33e8cf5";

    // PIN for certificate: C=US, O=VeriSign, Inc., OU=VeriSign Trust Network, OU=(c)
    // 2006 VeriSign, Inc. - For authorized use only, CN=VeriSign Class 3 Public Primary
    // Certification Authority - G5
    private static final String PIN_VERISIGN_C3_G5_CA = "b181081a19a4c0941ffae89528c124c99b34acc7";

    // PIN for certificate: C=US, O=VeriSign, Inc., OU=VeriSign Trust Network, OU=(c)
    // 2008 VeriSign, Inc. - For authorized use only, CN=VeriSign Universal Root Certification
    // Authority
    private static final String PIN_VERISIGN_UNIVERSAL = "bbc23e290bb328771dad3ea24dbdf423bd06b03d";

    // PIN for certificate: C=US, O=Symantec Corporation, Symantec Class 3 EV SSL CA - G3
    // 2013 Symantec Corporation - For autorized use only, CN=Symantec Trust Network
    private static final String PIN_SYMANTEC_3_EV_G3 = "82B52433C1B66EA9AD5798CD461F003E80B6F626";

    private static final String[] CA_PINS = {
        PIN_GLOBALSIGN,
        PIN_GLOBALSIGN_ECC_R4,
        PIN_GLOBALSIGN_R5,
        PIN_GLOBALSIGN_NV_SA,
        PIN_THAWTE,
        PIN_THAWTE_G3,
        PIN_VERISIGN_C3_G5_CA,
        PIN_VERISIGN_UNIVERSAL,
        PIN_SYMANTEC_3_EV_G3
    };

    private final List<byte[]> caPins = new LinkedList<byte[]>();
    private final Set<X509Certificate> cache = Collections
            .synchronizedSet(new HashSet<X509Certificate>());

    private X509TrustManager systemTrustManager;

    public CAPinningTrustManager() throws KeyStoreException, NoSuchAlgorithmException,
            IllegalStateException, CertStoreException {
        for (String pin : CA_PINS) {
            caPins.add(hexStringToByteArray(pin));
        }

        initializeSystemTrustManager();
    }

    private void initializeSystemTrustManager() throws NoSuchAlgorithmException,
            KeyStoreException, CertStoreException {
        TrustManagerFactory tmf = TrustManagerFactory
                .getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init((KeyStore) null);

        for (TrustManager tm : tmf.getTrustManagers()) {
            if (tm instanceof X509TrustManager) {
                systemTrustManager = (X509TrustManager) tm;
                break;
            }
        }

        if (systemTrustManager == null) {
            throw new CertStoreException("The system X509TrustManager could not be initialized");
        }
    }

    private boolean isValidPin(X509Certificate certificate) throws CertificateException {
        try {
            final MessageDigest digest = MessageDigest.getInstance("SHA1");
            final byte[] spki = certificate.getPublicKey().getEncoded();
            final byte[] spkiDigest = digest.digest(spki);

            /**
             * HINT: If you want to get SHA1-DER encoded key fingerprint, uncomment these lines.
             * You will get the hash on 'hex' variable. You can check it with 'conversionBack' one,
             * which should be the same as 'spkiDigest'.
             */
            // final String hex = bytesToHex(spkiDigest);
            // final byte[] conversionBack = hexStringToByteArray(hex);

            for (byte[] validPin : this.caPins) {
                if (Arrays.equals(validPin, spkiDigest)) {
                    return true;
                }
            }

            return false;
        } catch (NoSuchAlgorithmException nsae) {
            throw new CertificateException(nsae);
        }
    }

    private void checkPinTrust(X509Certificate[] chain) throws CertificateException {
        boolean isValid = false;

        // Iterate over all certificates chain
        if (chain != null && chain.length > 0) {
            for (int i = 0; i < chain.length && !isValid; ++i) {
                isValid = isValidPin(chain[i]);

                // Once we have a valid certificate, we can allow the request to be performed
                if (isValid) {
                    break;
                }
            }
        }

        // If there is no valid certificate, it might be an untrusted and insecure channel.
        // For security reasons, we do not allow the request to be performed.
        if (!isValid) {
            throw new CertificateException("The certificate authority was not a valid one.");
        }
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {
        systemTrustManager.checkClientTrusted(chain, authType);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType)
            throws CertificateException {
        // First let the system do its checks.
        systemTrustManager.checkServerTrusted(chain, authType);

        // Then do our additional checks only if the chain is not already in the cache.
        final X509Certificate rootCaCert = chain[chain.length - 1];
        if (cache.contains(rootCaCert)) {
            return;
        }

        checkPinTrust(chain);
        cache.add(rootCaCert);
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    /**
     * Converts from hexadecimal value to byte[]
     * @param s Hexadecimal value to be converted
     * @return Byte array representing the given hexadecimal value
     */
    private byte[] hexStringToByteArray(String s) {
        final int len = s.length();
        final byte[] data = new byte[len / 2];

        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }

        return data;
    }

    /**
     * Converts from byte[] to hexadecimal value
     * @param bytes Byte array to be transformed
     * @return Hexadecimal value corresponding to given byte[]
     */
    public static String bytesToHex(byte[] bytes) {
        // Black magic here
        // Found it on http://stackoverflow.com/questions/9655181/how-to-convert-a-byte-array-to-a-hex-string-in-java
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
