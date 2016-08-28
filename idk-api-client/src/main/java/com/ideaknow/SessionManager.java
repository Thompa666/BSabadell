package com.ideaknow;

import com.android.volley.NetworkResponse;

import android.util.Log;
import com.ideaknow.lib.StringUtils;

public class SessionManager {

    private static final String TAG = "SessionManager";

    /** The header to send the session cookie to the server. */
    public static final String HEADER_COOKIE = "Cookie";
    /** The header that the server uses to send the cookie to the client. */
    public static final String HEADER_SET_COOKIE = "Set-Cookie";

    private static String sSessionCookie;

    /** SessionCookie when user is not logged. */
    private static String sSessionCookieNotLogged;

    /**
     * Get the session cookie to be sent as an Http header 'Cookie'.
     *
     * @return the string formatted to be sent as the header 'Cookie'.
     */
    public static String getSessionCookie() {
        return sSessionCookie;
    }

    public static String getSessionCookieNotLogged() {
        return sSessionCookieNotLogged;
    }

    /**
     * Set the cookie as sent by the server using the header 'Set-Cookie'.
     *
     * @param sessionCookie e.g. JSESSIONID=21712BF381696CEB0B2D4B160A56637D; Path=/bsmobil_int/
     * @param logged set cookie for logged/not logged state
     */
    public static void setSessionCookie(String sessionCookie, boolean logged) {
        if (logged) {
            sSessionCookie = sessionCookie;
        } else {
            sSessionCookieNotLogged = sessionCookie;
        }
    }

    public static void closeSession() {
        sSessionCookie = "";
    }

    /**
     * Parses the 'Set-Cookie' header and sets the cookie {@link #setSessionCookie}.
     *
     * @param response the network response containing the headers to be parsed.
     */
    public static void parseSessionCookieFromHeaders(NetworkResponse response, boolean logged) {
        if (response == null || response.headers == null) {
            return;
        }

        // Because Volley sucks we get only one 'Set-Cookie' header, if the server sends more than
        // one, the chance that JSESSIONID is the one left is random.
        String headerSetCookie = response.headers.get(HEADER_SET_COOKIE);
        if (!StringUtils.isEmpty(headerSetCookie)) {
            SessionManager.setSessionCookie(headerSetCookie, logged);
        } else {
            Log.d(TAG, String.format("The Http header %s with the session cookie could not be"
                    + " found or was empty!", HEADER_SET_COOKIE));
        }
    }

    /**
     * Return if there is a session cookie to be sent.
     *
     * @return true if the session cookie is ready to be sent, false otherwise.
     */
    public static boolean isSessionCookieSet() {
        return !StringUtils.isEmpty(sSessionCookie);
    }
}
