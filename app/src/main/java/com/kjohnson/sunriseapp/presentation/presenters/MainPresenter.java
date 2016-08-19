package com.kjohnson.sunriseapp.presentation.presenters;

import com.kjohnson.sunriseapp.presentation.presenters.base.BasePresenter;
import com.kjohnson.sunriseapp.presentation.ui.BaseView;


public interface MainPresenter extends BasePresenter {

    void onSubmitButtonPressed();

    interface View extends BaseView {
        void displayWelcomeMessage(String msg);
        void navigateToTabActivity();
    }
}
