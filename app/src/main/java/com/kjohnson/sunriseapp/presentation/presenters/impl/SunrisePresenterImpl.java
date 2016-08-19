package com.kjohnson.sunriseapp.presentation.presenters.impl;

import com.kjohnson.sunriseapp.domain.executor.Executor;
import com.kjohnson.sunriseapp.domain.executor.MainThread;
import com.kjohnson.sunriseapp.domain.interactors.SunriseHourInteractor;
import com.kjohnson.sunriseapp.domain.interactors.impl.SunriseHourInteractorImpl;
import com.kjohnson.sunriseapp.domain.model.UserModel;
import com.kjohnson.sunriseapp.presentation.presenters.SunrisePresenter;
import com.kjohnson.sunriseapp.presentation.presenters.base.AbstractPresenter;

/**
 * Created by wolf on 8/18/2016.
 */

public class SunrisePresenterImpl extends AbstractPresenter implements SunrisePresenter,
        SunriseHourInteractor.Callback {

    private UserModel mUserModel;
    private SunrisePresenter.View mView;

    public SunrisePresenterImpl(Executor executor, MainThread mainThread,
                                SunrisePresenter.View view, UserModel userModel) {
        super(executor, mainThread);
        mView = view;
        mUserModel = userModel;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void onResponseRetrieved() {
//mView.algo
    }

    @Override
    public void onResponseFailed(String errorMessage) {

    }

    @Override
    public void onAstronomyApiRequest() {
//
//        LogInInteractor logInInteractor = new LogInInteractorImpl(
//                mExecutor,
//                mMainThread,
//                this,
//                mUserModel
//        );
//
//        logInInteractor.execute();
        SunriseHourInteractor sunriseHourInteractor = new SunriseHourInteractorImpl(
                mExecutor,
                mMainThread,
                this,
                mUserModel
        );

        sunriseHourInteractor.execute();

    }
}
