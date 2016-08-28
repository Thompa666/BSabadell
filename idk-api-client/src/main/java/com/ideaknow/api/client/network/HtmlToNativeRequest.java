package com.ideaknow.api.client.network;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;

import android.util.Log;
import com.ideaknow.SessionManager;
import com.ideaknow.api.client.BuildConfig;
import com.ideaknow.api.client.gateway.IDKVolleyGateway;

import java.io.*;
import java.util.*;

/**
 * Volley request parsing Json strings using a Gson deserializer
 */
public class HtmlToNativeRequest extends Request<NativeResponse> {

    /** Charset for request. */
    private static final String PROTOCOL_CHARSET = "utf-8";

    /** The body of POST/PUT request. */
    private final String mRequestBody;
    private final Response.Listener<NativeResponse> mListener;
    protected String mUrl = "";
    private final Map<String, String> mHeaders;

    /**
     * Create a new Gson Json-parser request with a custom gson instance (useful for specifying
     * custom date formats, etc.)
     *
     * @param method the Http method see {@link com.android.volley.Request.Method}
     * @param url request url.
     * @param listener response listener.
     * @param errorListener error listener.
     */
    public HtmlToNativeRequest(final int method, final String url,
            final String requestBody, Map<String, String> headers,
            final Response.Listener<NativeResponse> listener,
            final Response.ErrorListener errorListener) {
        super(method, url, errorListener);

        mRequestBody = requestBody;
        mListener = listener;
        mUrl = url;
        mHeaders = headers;

        if (BuildConfig.DEBUG) {
            setRetryPolicy(IDKVolleyGateway.IDK_RETRY_POLICY_DEBUG);
        }
        else {
            setRetryPolicy(IDKVolleyGateway.IDK_RETRY_POLICY);
        }
    }

    @Override
    protected Response<NativeResponse> parseNetworkResponse(final NetworkResponse response) {
        try {
            String charset = HttpHeaderParser.parseCharset(response.headers);
            final String responseData = new String(response.data, charset);

            logResponse("Request finished with response from the server:", response, responseData);

            NativeResponse responseObject = new NativeResponse(mUrl, response.statusCode, "",
                    response.headers, responseData);

            return Response.success(responseObject, HttpHeaderParser.parseCacheHeaders(response));
        } catch (Exception e) {
            if (IDKVolleyGateway.DEBUG) {
                Log.d(IDKVolleyGateway.TAG, e.getMessage(), e);
            }
            return Response.error(new ParseError(e));
        }
    }

    @Override
    protected void deliverResponse(final NativeResponse response) {
        mListener.onResponse(response);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        if (SessionManager.isSessionCookieSet()) {
            mHeaders.put(SessionManager.HEADER_COOKIE, SessionManager.getSessionCookie());
        }
        return mHeaders;
    }

    @Override
    public byte[] getBody() {
        try {
            return mRequestBody == null ? null : mRequestBody.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException uee) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s",
                    mRequestBody, PROTOCOL_CHARSET);
            return null;
        }
    }

    /**
     * Log the response of this request with a custom message.
     *
     * @param message the message to show with the request.
     * @param response the response to log.
     * @param json the json received in the body response.
     */
    protected <T> void logResponse(final String message, final NetworkResponse response,
            final String json) {
        if (!IDKVolleyGateway.DEBUG) {
            return;
        }

        StringBuilder log = new StringBuilder();

        String url = "";
        log.append("\n").append(message).append("\n");
        log.append(" \n");
        log.append("\n=============== HTML RESPONSE ===============\n");
        log.append(url).append(mUrl).append("\n");
        log.append("HTTP Status Code: ");
        if (response != null) {
            log.append(response.statusCode).append("\n");
        }

        log.append("\n=============== HTML HEADERS ================\n");
        if (response != null && response.headers != null) {
            for (Map.Entry<String, String> header : response.headers.entrySet()) {
                log.append(header.getKey()).append("=").append(header.getValue()).append("\n");
            }
        }

        log.append("\n================= HTML BODY =================\n");
        if (json != null) {
            log.append(json).append("\n");
        }
        log.append("\n============= HTML END RESPONSE =============\n");
        log.append(" \n");

        LargeTextLogger.d(IDKVolleyGateway.TAG, log);
    }

    @Override
    /**
     * Gets body content type
     */
    public String getBodyContentType()
    {
        // TWEAK: If we return a value here, it becomes concatenated to the one
        // given from HTML code. Hence, we just need to return a nullable value here
        // in order to send the given Content-Type header.
        return null;
    }
}
