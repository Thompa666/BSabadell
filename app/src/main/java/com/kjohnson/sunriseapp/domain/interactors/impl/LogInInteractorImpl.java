package com.kjohnson.sunriseapp.domain.interactors.impl;

import com.kjohnson.sunriseapp.domain.executor.Executor;
import com.kjohnson.sunriseapp.domain.executor.MainThread;
import com.kjohnson.sunriseapp.domain.interactors.LogInInteractor;
import com.kjohnson.sunriseapp.domain.interactors.base.AbstractInteractor;
import com.kjohnson.sunriseapp.domain.model.UserModel;

/**
 * Created by wolf on 8/17/2016.
 */

/*
 * Interactor implementation that will work out on the log in use case
 */
public class LogInInteractorImpl extends AbstractInteractor implements LogInInteractor {

    private LogInInteractor.Callback mCallback;
    private UserModel mUserModel;

    public LogInInteractorImpl(Executor threadExecutor,
                               MainThread mainThread,
                               Callback callback,
                               UserModel userModel) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mUserModel = userModel;
    }

    /*
     * Validation of the user on the log in process
     */
    private Boolean isValidUser(UserModel user) {
        if (user.getmUserName().isEmpty() || user.getmUserPassword().isEmpty()) return false;
        else return true;

    }

    private void notifyError(String message) {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onLoginUnsuccesful("message");
            }
        });
    }

    private void logginSuccesful() {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onLoginSuccessful();
            }
        });
    }


    @Override
    public void run() {

        //validation of user
        Boolean isValidUser = isValidUser(mUserModel);
        if (isValidUser.equals(false)) {
            notifyError("Not a valid User");
            return ;
        }

        //If validation is right, we proceed with the log in
        logginSuccesful();

    }


}
