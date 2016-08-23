package com.kjohnson.sunriseapp.presentation.dependencyInjection.modules;

import com.kjohnson.sunriseapp.domain.model.UserModel;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by alten on 23/8/16.
 */
@Module
public class DomainModule {

    //PerActivity not working
    @Provides @Singleton
    UserModel provideUserModel(UserModel userModel){
        return userModel;
    }

}
