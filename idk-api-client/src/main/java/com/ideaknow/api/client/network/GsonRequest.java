package com.ideaknow.api.client.network;

import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.ideaknow.api.client.ApiCache;
import com.ideaknow.api.client.gateway.HtmlFacadeError;
import com.ideaknow.api.client.gateway.IDKVolleyGateway;
import com.ideaknow.lib.StringUtils;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.util.Map;

/**
 * Volley request parsing Json strings using a Gson deserializer
 */
public class GsonRequest<T> extends Request<T> {
    /**
     * Location header name
     */
    private static final String LOCATION_HEADER = "Location";

    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_TEXT_HTML = "text/html";
    public static final int HTTP_STATUS_OK = 200;

    protected final int mMethod;
    protected final Class<T> mTypeOfT;
    private final Response.Listener<T> mListener;
    protected Response.ErrorListener mErrorListener;
    protected final Gson mGson;
    protected String mUrl = "";

    protected boolean mIsCached = false;

    /**
     * Create a new Gson Json-parser request.
     *
     * @param method the Http method see {@link com.android.volley.Request.Method}
     * @param typeOfT type of generic.
     * @param url request url.
     * @param listener response listener.
     * @param errorListener error listener.
     */
    public GsonRequest(final int method, final Class<T> typeOfT, final String url,
            final Response.Listener<T> listener,
            final Response.ErrorListener errorListener) {
        this(method, typeOfT, url, listener, errorListener, new Gson());
    }

    /**
     * Create a new Gson Json-parser request with a custom gson instance (useful for specifying
     * custom date formats, etc.)
     *
     * @param method the Http method see {@link com.android.volley.Request.Method}
     * @param typeOfT type of generic.
     * @param url request url.
     * @param listener response listener.
     * @param errorListener error listener.
     * @param gson custom Gson instance.
     */
    public GsonRequest(final int method, final Class<T> typeOfT, final String url,
            final Response.Listener<T> listener,
            final Response.ErrorListener errorListener, final Gson gson) {
        super(method, url, errorListener);

        mListener = listener;
        mTypeOfT = typeOfT;
        mGson = gson;
        mUrl = url;
        mMethod = method;
        mErrorListener = errorListener;
    }

    @Override
    protected Response<T> parseNetworkResponse(final NetworkResponse response) {
        try {
            String charset = HttpHeaderParser.parseCharset(response.headers);
            final String responseData = new String(response.data, charset);

            logResponse("Request finished with response from the server:", response, responseData);

            if (isHtmlFacade(response)) {
                return Response.error(new HtmlFacadeError(responseData));
            }

            if(mTypeOfT.equals(JSONObject.class)){
                JSONObject jsonObject = new JSONObject(responseData);
                return Response.success((T) jsonObject, HttpHeaderParser.parseCacheHeaders(response));
            }

            T responseObject = mGson.fromJson(responseData, mTypeOfT);

            if (mIsCached) {
                ApiCache.put(mUrl, responseObject);
            }

            return Response.success(responseObject, HttpHeaderParser.parseCacheHeaders(response));
        } catch (Exception e) {
            if (IDKVolleyGateway.DEBUG) {
                Log.d(IDKVolleyGateway.TAG, e.getMessage(), e);
            }
            return Response.error(new ParseError(e));
        }
    }

    /**
     * @param response the response to check
     * @return true if the response contains html according to its Content-Type and the status is
     * 200 OK.
     */
    private boolean isHtmlFacade(NetworkResponse response) {
        Map<String, String> headers = response.headers;
        String contentType = headers.get(HEADER_CONTENT_TYPE);

        return response.statusCode == HTTP_STATUS_OK && contentType != null
                && contentType.contains(CONTENT_TYPE_TEXT_HTML);
    }

    @Override
    protected void deliverResponse(final T response) {
        mListener.onResponse(response);
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
        log.append("\n=============== RESPONSE ===============\n");
        log.append(url).append(mUrl).append("\n");
        log.append("HTTP Status Code: ");
        if (response != null) {
            log.append(response.statusCode).append("\n");
        }

        log.append("\n=============== HEADERS ================\n");
        if (response != null && response.headers != null) {
            for (Map.Entry<String, String> header : response.headers.entrySet()) {
                log.append(header.getKey()).append("=").append(header.getValue()).append("\n");
            }
        }

        log.append("\n================= BODY =================\n");
        if (json != null) {
            log.append(json).append("\n");
        }
        log.append("\n============= END RESPONSE =============\n");
        log.append(" \n");

        LargeTextLogger.d(IDKVolleyGateway.TAG, log);
    }

    @Override
    /**
     * Handles error delivery
     */
    public void deliverError(final VolleyError error) {
        boolean errorHandled = false;

        if (error != null && error.networkResponse != null && error.networkResponse.headers != null) {
            final int status = error.networkResponse.statusCode;
            // Handle 30x redirections
            if (HttpURLConnection.HTTP_MOVED_PERM == status || status == HttpURLConnection.HTTP_MOVED_TEMP ||
                    status == HttpURLConnection.HTTP_SEE_OTHER) {
                // Get new location from header
                final String location = error.networkResponse.headers.get(LOCATION_HEADER);

                // Check for null or empty values
                if (!StringUtils.isEmpty(location) && !StringUtils.isBlank(location)) {
                    // Create a request clone and change the url to redirect location
                    final GsonRequest<T> request = new GsonRequest<T>(mMethod, mTypeOfT, location,
                            mListener, mErrorListener, mGson);

                    // Check whether request queues manager has already been initialized or not
                    if (RequestQueuesManager.hasBeenInitialized()) {
                        // Add it to network queue
                        RequestQueuesManager.getConcurrentRequestsQueue().add(request);

                        // Set error as handled
                        errorHandled = true;
                    }
                }
            }
        }

        // If error has not been handled at this point, deliver it to error listeners
        if (!errorHandled) {
            super.deliverError(error);
        }
    }
}
