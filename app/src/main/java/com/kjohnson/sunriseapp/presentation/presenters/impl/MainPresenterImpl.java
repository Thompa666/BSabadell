package com.kjohnson.sunriseapp.presentation.presenters.impl;

import com.kjohnson.sunriseapp.domain.executor.Executor;
import com.kjohnson.sunriseapp.domain.executor.MainThread;
import com.kjohnson.sunriseapp.domain.interactors.LogInInteractor;
import com.kjohnson.sunriseapp.domain.interactors.impl.LogInInteractorImpl;
import com.kjohnson.sunriseapp.domain.model.UserModel;
import com.kjohnson.sunriseapp.presentation.presenters.MainPresenter;
import com.kjohnson.sunriseapp.presentation.presenters.base.AbstractPresenter;

/**
 * Created by dmilicic on 12/13/15.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        LogInInteractor.Callback {

    private MainPresenter.View mView;
    private UserModel mUserModel;

    public MainPresenterImpl(Executor executor, MainThread mainThread,
                             View view, UserModel userModel) {
        super(executor, mainThread);
        mView = view;
        mUserModel = userModel;
    }

    @Override
    public void onSubmitButtonPressed() {
        //Here comes the button event with the fields captured, and here we create our interactor
        //to interact with the validation hosted in itself.
        LogInInteractor logInInteractor = new LogInInteractorImpl(
                mExecutor,
                mMainThread,
                this,
                mUserModel
        );

        logInInteractor.execute();
    }

    @Override
    public void resume() {

        mView.showProgress();

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
        mView.showError(message);
    }


    @Override
    public void onLoginSuccessful() {
        //LLamar a un método para realizar la operación
        mView.navigateToTabActivity();
    }

    @Override
    public void onLoginUnsuccesful(String errorMessage) {
        mView.showError(errorMessage);
    }
}
