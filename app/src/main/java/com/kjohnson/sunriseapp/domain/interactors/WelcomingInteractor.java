package com.kjohnson.sunriseapp.domain.interactors;


import com.kjohnson.sunriseapp.domain.interactors.base.Interactor;


public interface WelcomingInteractor extends Interactor {

    interface Callback {

        void onMessageRetrieved(String message);

        void onRetrievalFailed(String error);
    }
}
