package com.ideaknow.api.client.network;

import java.util.*;

/**
 * THIS IS EXACT COPY OF CLASS FROM IDKWebView project.
 * It's copied here to avoid creating dependancy api-client - IDKWebView
 */
public class NativeResponse {

    private String url;
    private int status;
    private String statusText;
    private Map<String, String> headers;
    private String body;

    public NativeResponse(String url, int status, String statusText,
            Map<String, String> headers, String body) {
        this.url = url;
        this.status = status;
        this.statusText = statusText;
        this.headers = headers;
        this.body = body;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
