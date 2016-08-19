package com.kjohnson.sunriseapp.domain.interactors;

import com.kjohnson.sunriseapp.domain.interactors.base.Interactor;

/**
 * Created by wolf on 8/17/2016.
 */

public interface LogInInteractor extends Interactor{

    interface Callback{

        void onLoginSuccessful();

        void onLoginUnsuccesful(String error);

    }
}
