package com.kjohnson.sunriseapp.presentation.dependencyInjection.components;

import android.app.Activity;

import com.kjohnson.sunriseapp.domain.model.UserModel;
import com.kjohnson.sunriseapp.presentation.dependencyInjection.modules.ApplicationModule;
import com.kjohnson.sunriseapp.presentation.dependencyInjection.modules.UserModelModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alten on 23/8/16.
 */

@Singleton @Component(modules = {UserModelModule.class})
public interface UserModelComponent {

    void inject(Activity MainActivity);
}
