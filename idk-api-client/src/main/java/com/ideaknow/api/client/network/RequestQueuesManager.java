package com.ideaknow.api.client.network;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.NoCache;
import com.ideaknow.api.client.error.ExceptionLogger;
import com.ideaknow.api.client.network.ssl.CAPinningTrustManager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertStoreException;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/**
 * Manager used to save request queues
 * Created by corteggo on 11/7/16.
 */
public final class RequestQueuesManager {
    /**
     * Maximum allowed concurrent requests for blockConcurrentRequestsQueue
     */
    private static final int NUMBER_OF_CONCURRENT_REQUESTS = 1;

    /**
     * SSL version
     */
    public static final String SSL_VERSION = "TLS";

    /**
     * Debugging state
     */
    private static boolean debugging = false;

    /**
     * Global request queue for non-concurrent requests
     */
    private static RequestQueue nonConcurrentRequestsQueue;

    /**
     * Global request queue for concurrent requests
     */
    private static RequestQueue concurrentRequestsQueue;

    /**
     * Gets non-concurrent request queue
     * @return Non-concurrent request queue instance
     */
    public static RequestQueue getNonConcurrentRequestsQueue() {
        return nonConcurrentRequestsQueue;
    }

    /**
     * Sets non-concurrent request queue
     * @param requestQueue Non-concurrent request queue instance
     */
    public static void setNonConcurrentRequestsQueue(RequestQueue requestQueue) {
        RequestQueuesManager.nonConcurrentRequestsQueue = requestQueue;
    }

    /**
     * Gets concurrent request queue
     * @return Concurrent request queue
     */
    public static RequestQueue getConcurrentRequestsQueue() {
        return concurrentRequestsQueue;
    }

    /**
     * Sets concurrent request queue
     * @param requestQueue Concurrent request queue instance
     */
    public static void setConcurrentRequestsQueue(RequestQueue requestQueue) {
        RequestQueuesManager.concurrentRequestsQueue = requestQueue;
    }

    /**
     * Initializes request queues manager
     * @param context Context to create request queues from
     */
    public static void init(Context context) {
        setNonConcurrentRequestsQueue(newRequestQueue(context, true));
        setConcurrentRequestsQueue(newRequestQueue(context, false));
    }

    /**
     * Gets whether request queues manager has been initialized or not
     * @return True if it has been initialized; false otherwise
     */
    public static boolean hasBeenInitialized() {
        return nonConcurrentRequestsQueue != null && concurrentRequestsQueue != null;
    }

    /**
     * Creates a new requests queue
     * @param context Contex to create requests queue from
     * @param blockConcurrent Boolean used to indicate whether the returned queue should block concurrent requests or not
     * @return RequestQueue instance for the given arguments
     */
    private static RequestQueue newRequestQueue(Context context, boolean blockConcurrent) {
        // The minSdkVersion is always >= 9, so we can use HttpUrlConnection.
        // See: http://android-developers.blogspot.com/2011/09/androids-http-clients.html
        HttpStack stack = new HurlStack(null, createSSLSocketFactory(context));
        Network network = new BasicNetwork(stack);

        RequestQueue queue;
        if (blockConcurrent) {
            queue = new RequestQueue(new NoCache(), network, NUMBER_OF_CONCURRENT_REQUESTS);
        } else {
            queue = new RequestQueue(new NoCache(), network);
        }
        queue.start();

        return queue;
    }

    /**
     * Creates an SSL socket factory
     * @param context Context to create factory from
     * @return SSLSocketFactory instance for the given context
     */
    private static SSLSocketFactory createSSLSocketFactory(Context context) {
        try {
            TrustManager[] trustManagers = new TrustManager[1];
            trustManagers[0] = new CAPinningTrustManager();

            SSLContext sslContext = SSLContext.getInstance(SSL_VERSION);
            sslContext.init(null, trustManagers, null);

            return sslContext.getSocketFactory();
        } catch (NoSuchAlgorithmException nsae) {
            logSslError(context, nsae);
        } catch (KeyManagementException kme) {
            logSslError(context, kme);
        } catch (KeyStoreException kse) {
            logSslError(context, kse);
        } catch (CertStoreException cse) {
            logSslError(context, cse);
        }

        return null;
    }

    /**
     * Log SSL errors
     * @param context Context to log from
     * @param exception Exception to be logged
     */
    private static void logSslError(Context context, Exception exception) {
        if (context instanceof ExceptionLogger) {
            ExceptionLogger exceptionLogger = (ExceptionLogger) context;
            exceptionLogger.logException(exception);
        }
    }

    /**
     * Cancels all pending requests by the specified TAG, it is important to specify a TAG so that
     * the pending/ongoing requests can be cancelled.
     *
     * @param tag must be not null.
     */
    public static void cancelPendingRequests(Object tag) {
        if (tag != null && hasBeenInitialized()) {
            nonConcurrentRequestsQueue.cancelAll(tag);
            concurrentRequestsQueue.cancelAll(tag);
        }
    }
}
