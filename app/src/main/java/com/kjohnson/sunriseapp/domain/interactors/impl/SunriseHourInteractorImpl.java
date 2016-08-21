package com.kjohnson.sunriseapp.domain.interactors.impl;

import com.kjohnson.sunriseapp.data.gateway.base.Gateway;
import com.kjohnson.sunriseapp.data.gateway.impl.GatewayImpl;
import com.kjohnson.sunriseapp.domain.executor.Executor;
import com.kjohnson.sunriseapp.domain.executor.MainThread;
import com.kjohnson.sunriseapp.domain.interactors.SunriseHourInteractor;
import com.kjohnson.sunriseapp.domain.interactors.base.AbstractInteractor;
import com.kjohnson.sunriseapp.domain.model.UserModel;

/**
 * Created by wolf on 8/18/2016.
 */

public class SunriseHourInteractorImpl extends AbstractInteractor implements SunriseHourInteractor {

    SunriseHourInteractor.Callback mCallback;
    UserModel mUserModel;

    public SunriseHourInteractorImpl(Executor threadExecutor,
                                     MainThread mainThread,
                                     SunriseHourInteractor.Callback callback,
                                     UserModel userModel) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mUserModel = userModel;
    }

    private void notifyError(String message) {
        mCallback.onResponseFailed("Error retreiving information");
    }

    private void requestSuccesful() {
        mCallback.onResponseRetrieved();
    }
    @Override
    public void run() {
        //Here im gonna make the call from a gateway which is similar behaviour to interactors
        //but for network purposes instead
        //Volley  request delegate to gatway so:
//        LogInInteractor logInInteractor = new LogInInteractorImpl(
//                mExecutor,
//                mMainThread,
//                this,
//                mUserModel
//        );
//
//        logInInteractor.execute();
        Gateway gateway = new GatewayImpl(mUserModel);
        gateway.request();
        //todo depende del resultado llamar a los 2 métodos
        //if rquest ok llamar a mCallback.OnResponseRetrieved(argumentos)

    }

}
