package com.ideaknow.api.client.gateway;

import com.android.volley.VolleyError;

public class DecodeError extends VolleyError {

    private String data;
    private String charset;

    public DecodeError(String data, String charset) {
        this.data = data;
        this.charset = charset;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }
}
