package com.ideaknow.api.client.gateway;

import com.android.volley.VolleyError;

public class HtmlFacadeError extends VolleyError {

    private String html;

    public HtmlFacadeError(String html) {
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
