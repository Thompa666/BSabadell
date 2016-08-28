package com.ideaknow.api.client.network;

import com.android.volley.Response;

import com.ideaknow.api.client.ApiCache;

/**
 * Volley request parsing Json strings using the Gson deserializer and invalidating cache
 */
public class IDKInvalidateCacheGsonRequest<T> extends IDKGsonRequest<T> {

    public IDKInvalidateCacheGsonRequest(final int method, final Class<T> returnType,
            final String url,
            final String requestBody, final Response.Listener<T> listener,
            final Response.ErrorListener errorListener) {
        super(method, returnType, url, requestBody, listener, errorListener);
        ApiCache.clear();
    }
}
