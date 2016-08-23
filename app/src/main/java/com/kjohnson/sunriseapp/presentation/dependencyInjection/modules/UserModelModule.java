package com.kjohnson.sunriseapp.presentation.dependencyInjection.modules;

import com.kjohnson.sunriseapp.AndroidApplication;
import com.kjohnson.sunriseapp.domain.model.UserModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alten on 23/8/16.
 */

@Module
public class UserModelModule {

    UserModel mUserModel;

/*    public UserModelModule(UserModel userModel){
        mUserModel = userModel;
    }*/
    private final AndroidApplication application;

    public UserModelModule(AndroidApplication application){
        this.application = application;
    }

    @Provides @Singleton UserModel provideUserModel(){
            return new UserModel("UserNameTest", "PasswordTests");
    }

}
