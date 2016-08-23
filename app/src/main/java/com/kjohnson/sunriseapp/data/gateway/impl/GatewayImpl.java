package com.kjohnson.sunriseapp.data.gateway.impl;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.kjohnson.sunriseapp.AndroidApplication;
import com.kjohnson.sunriseapp.data.CustomRequest;
import com.kjohnson.sunriseapp.data.gateway.base.Gateway;
import com.kjohnson.sunriseapp.domain.model.UserModel;

/**
 * Created by wolf on 8/18/2016.
 */

public class GatewayImpl implements Gateway {

    String url;
    String url2;
    String url3;

    public GatewayImpl(UserModel userModel) {
        //super(threadExecutor);
        url = "http://bernera.zapto.org/astronomy/astronomy.asmx?op=showSunrise";
        url2 = "http://api.androidhive.info/volley/string_response.html";
        url3 = "http://www.webservicex.com/globalweather.asmx";

    }


    @Override
    public void request() {

       /* RequestQueue requestQueue = Volley.newRequestQueue(AndroidApplication.getAppContext());

        CustomRequest customRequest = new CustomRequest(Request.Method.POST, url3, new Response.Listener() {
            @Override
            public void onResponse(Object response) {

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                NetworkResponse networkResponse = error.networkResponse;

            }
        });

        requestQueue.add(customRequest);*/
    }



}
