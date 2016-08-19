package com.kjohnson.sunriseapp.presentation.presenters;

import com.kjohnson.sunriseapp.presentation.presenters.base.BasePresenter;
import com.kjohnson.sunriseapp.presentation.ui.BaseView;

/**
 * Created by wolf on 8/18/2016.
 */

public interface SunrisePresenter extends BasePresenter {

    void onAstronomyApiRequest();

    interface View extends BaseView {
        void showResponse();
    }
}
