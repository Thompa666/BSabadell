package com.kjohnson.sunriseapp.data.gateway.base;

import com.kjohnson.sunriseapp.domain.executor.Executor;

/**
 * Created by wolf on 8/18/2016.
 */

public abstract class AbstractGateway implements Gateway {

    protected Executor mThreadExecutor;

    public AbstractGateway(Executor threadExecutor) {
        mThreadExecutor = threadExecutor;
    }

    public abstract void run();

    @Override
    public void request() {
        mThreadExecutor.request(this);
    }
}
