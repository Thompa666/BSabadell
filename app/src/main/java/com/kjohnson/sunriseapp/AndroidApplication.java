package com.kjohnson.sunriseapp;

import android.app.Application;
import android.content.Context;


import com.kjohnson.sunriseapp.domain.model.UserModel;
import com.kjohnson.sunriseapp.presentation.dependencyInjection.components.DaggerUserModelComponent;
import com.kjohnson.sunriseapp.presentation.dependencyInjection.components.DomainComponent;
import com.kjohnson.sunriseapp.presentation.dependencyInjection.components.UserModelComponent;
import com.kjohnson.sunriseapp.presentation.dependencyInjection.modules.ApplicationModule;
import com.kjohnson.sunriseapp.presentation.dependencyInjection.modules.UserModelModule;


import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class AndroidApplication extends Application {

    private static Context context;
    private DomainComponent mDomainComponent;
    private UserModelComponent userModelComponent;


    @Override
    public void onCreate() {
        super.onCreate();

//        mDomainComponent = DaggerDomainComponent.builder.domainModule(new DomainModule(this)).build();
//        mDomainComponent = DaggerDomainComponent.builder().domainModule(new DomainModule(this)).build();
//          userModelComponent = DaggerUserModelComponent.builder().build();
        userModelComponent = DaggerUserModelComponent.builder().userModelModule(
                new UserModelModule(this)).build();

        // initiate Timber
        Timber.plant(new DebugTree());
    }

    public DomainComponent getmDomainComponent(){
        return mDomainComponent;
    }

    public UserModelComponent getUserModelComponent(){
        return userModelComponent;
    }


}
