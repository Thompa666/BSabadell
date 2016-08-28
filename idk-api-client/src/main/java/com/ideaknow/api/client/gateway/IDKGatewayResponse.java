package com.ideaknow.api.client.gateway;

import com.ideaknow.api.client.model.ErrorResponse;

/**
 * A generic response listener to use by any gateway that recovers model data from any source.
 */
public class IDKGatewayResponse<T> {

    public interface Listener<T> {
        /** Called when a response is received. */
        public void onResponse(T response);
    }

    public interface ErrorListener {
        /**
         * Callback method that an error has been occurred with the user-readable message.
         */
        public void onErrorResponse(ErrorResponse errorResponse);
    }
}
