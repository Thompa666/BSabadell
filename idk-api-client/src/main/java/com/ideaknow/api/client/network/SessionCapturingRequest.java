package com.ideaknow.api.client.network;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import android.util.Log;
import com.google.gson.Gson;
import com.ideaknow.SessionManager;
import com.ideaknow.api.client.gateway.DecodeError;
import com.ideaknow.api.client.gateway.IDKVolleyGateway;
import com.ideaknow.lib.StringUtils;

import java.util.*;

/**
 * An IDKGsonRequest that stores the session cookie received as an 'Set-Cookie' Http header in the
 * SessionManager.
 *
 * NOTE: Due to a limitation in Volley implementation this will only work reliably if the server
 * only sends a 'Set-Cookie'.
 */
public class SessionCapturingRequest<T> extends IDKGsonRequest<T> {

    public static final String HEADER_USER_AGENT = "User-Agent";

    public SessionCapturingRequest(int method, Class<T> returnType, String url,
            Response.Listener<T> listener,
            Response.ErrorListener errorListener) {
        super(method, returnType, url, listener, errorListener);
    }

    public SessionCapturingRequest(int method, Class<T> returnType, String url,
            String requestBody, Response.Listener<T> listener,
            Response.ErrorListener errorListener) {
        super(method, returnType, url, requestBody, listener, errorListener);
    }

    public SessionCapturingRequest(int method, Class<T> returnType, String url,
            Response.Listener<T> listener,
            Response.ErrorListener errorListener, Gson gson) {
        super(method, returnType, url, listener, errorListener, gson);
    }

    public SessionCapturingRequest(int method, Class<T> returnType, String url,
            String requestBody, Response.Listener<T> listener,
            Response.ErrorListener errorListener, Gson gson) {
        super(method, returnType, url, requestBody, listener, errorListener, gson);
    }

    public SessionCapturingRequest(int method, Class<T> returnType, String url,
            String requestBody, Response.Listener<T> listener,
            Response.ErrorListener errorListener, Gson gson,
            Priority priority) {
        super(method, returnType, url, requestBody, listener, errorListener, gson, priority);
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
            String charset = HttpHeaderParser.parseCharset(response.headers);
            final String jsonString = new String(response.data, charset);

            if (StringUtils.isEmpty(jsonString)) {
                return Response.error(new DecodeError(getHeadersAsString(response.headers),
                        charset));
            }

            SessionManager.parseSessionCookieFromHeaders(response, true);

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

    // TEMPORAL - Log the headers in case of error so API can check them.
    private String getHeadersAsString(Map<String, String> headers) {
        StringBuilder log = new StringBuilder();

        for (Map.Entry<String, String> header : headers.entrySet()) {
            if (!header.getKey().equals("Set-Cookie")) {
                log.append(header.getKey()).append(": ").append(header.getValue()).append("\n");
            }
        }

        return log.toString();
    }
}
