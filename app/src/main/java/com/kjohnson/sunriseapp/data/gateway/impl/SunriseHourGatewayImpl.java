package com.kjohnson.sunriseapp.data.gateway.impl;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.kjohnson.sunriseapp.data.AppController;
import com.kjohnson.sunriseapp.data.SunriseHourGateway;
import com.kjohnson.sunriseapp.data.gateway.base.AbstractGateway;
import com.kjohnson.sunriseapp.domain.executor.Executor;

/**
 * Created by wolf on 8/18/2016.
 */

public class SunriseHourGatewayImpl extends AbstractGateway implements SunriseHourGateway {

    String url;

    public SunriseHourGatewayImpl(Executor threadExecutor) {
        super(threadExecutor);
        url = "http://bernera.zapto.org/astronomy/astronomy.asmx";
    }

    @Override
    public void run() {

        // Tag used to cancel the request
        String  tag_string_req = "string_req";

        //Hacer Volley Request
        StringRequest stringRequest = new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Log.d("Test", "My response value is" + response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(stringRequest, tag_string_req);

    }


}
