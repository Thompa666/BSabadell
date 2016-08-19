package com.kjohnson.sunriseapp.data.gateway;

import com.kjohnson.sunriseapp.data.gateway.base.Gateway;

/**
 * Created by wolf on 8/18/2016.
 */

public interface SunriseHourGateway extends Gateway {

    interface Callback {

        void onResponseRetrievedGateway();

        void onResponseFailedGateway(String errorMessage);

    }

}
