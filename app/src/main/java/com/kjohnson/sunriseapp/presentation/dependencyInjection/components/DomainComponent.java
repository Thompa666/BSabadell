package com.kjohnson.sunriseapp.presentation.dependencyInjection.components;

import com.kjohnson.sunriseapp.presentation.dependencyInjection.modules.DomainModule;
import com.kjohnson.sunriseapp.presentation.ui.activities.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alten on 23/8/16.
 */

//@Singleton @Component(modules = {DomainModule.class})
public interface DomainComponent {

    void inject(MainActivity activity);
}
