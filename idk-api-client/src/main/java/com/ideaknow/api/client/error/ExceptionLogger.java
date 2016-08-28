package com.ideaknow.api.client.error;

/**
 * Interface to log locally or remotely exceptions related to the network module.
 */
public interface ExceptionLogger {

    void logException(Exception exception);

}
