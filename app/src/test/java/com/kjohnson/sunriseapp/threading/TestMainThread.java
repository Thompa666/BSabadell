package com.kjohnson.sunriseapp.threading;

import com.kjohnson.sunriseapp.domain.executor.MainThread;

/**
 * Created by dmilicic on 1/8/16.
 */
public class TestMainThread implements MainThread {

    @Override
    public void post(Runnable runnable) {
        // tests can run on this thread, no need to invoke other threads
        runnable.run();
    }
}
