package com.kjohnson.sunriseapp.presentation.dependencyInjection.modules;

import android.app.Application;
import android.content.Context;

import com.kjohnson.sunriseapp.AndroidApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alten on 23/8/16.
 */


public class ApplicationModule {
    Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }
/*
    @Provides @Singleton
    Context provideApplicationContext(){
        return this.mAndroidApplication;
    }*/

    Application providesApplication() {
        return mApplication;
    }



}
