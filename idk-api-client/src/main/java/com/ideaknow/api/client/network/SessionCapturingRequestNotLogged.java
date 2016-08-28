package com.ideaknow.api.client.network;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import android.util.Log;
import com.ideaknow.SessionManager;
import com.ideaknow.api.client.gateway.IDKVolleyGateway;

import java.util.*;

/**
 * An IDKGsonRequest that stores the session cookie received as an 'Set-Cookie' Http header in the
 * SessionManager without requeriment of user will be logged. Differs from 
 * SessionCapturingRequest storing cookie value at sSessionCookieNotLogged
 *
 * NOTE: Due to a limitation in Volley implementation this will only work reliably if the server
 * only sends a 'Set-Cookie'.
 */
public class SessionCapturingRequestNotLogged<T> extends IDKGsonRequest<T> {

    public static final String HEADER_USER_AGENT = "User-Agent";

    public SessionCapturingRequestNotLogged(int method, Class<T> returnType, String url,
            Response.Listener<T> listener,
            Response.ErrorListener errorListener) {
        super(method, returnType, url, listener, errorListener);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> headers = super.getHeaders();
        headers.put(HEADER_USER_AGENT, IDKVolleyGateway.mUserAgent);

        return headers;
    }

    @Override
    protected Response<T> parseNetworkResponse(final NetworkResponse response) {
        try {
            final String jsonString = new String(response.data,
                    HttpHeaderParser.parseCharset(response.headers));

            SessionManager.parseSessionCookieFromHeaders(response, false);

            logResponse("The session capturing request finished with response from the server:",
                    response, jsonString);

            return Response.success(mGson.fromJson(jsonString, mTypeOfT),
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (Exception e) {
            if (IDKVolleyGateway.DEBUG) {
                Log.d(IDKVolleyGateway.TAG, e.getMessage(), e);
            }
            return Response.error(new ParseError(e));
        }
    }
}
