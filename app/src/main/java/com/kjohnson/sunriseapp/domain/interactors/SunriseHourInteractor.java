package com.kjohnson.sunriseapp.domain.interactors;

import com.kjohnson.sunriseapp.domain.interactors.base.Interactor;

/**
 * Created by wolf on 8/18/2016.
 */

public interface SunriseHourInteractor extends Interactor {


    interface Callback {

        void onResponseRetrieved();

        void onResponseFailed(String errorMessage);

    }
}
