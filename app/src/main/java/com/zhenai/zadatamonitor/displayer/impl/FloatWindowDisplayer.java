package com.zhenai.zadatamonitor.displayer.impl;

import com.zhenai.zadatamonitor.Constants;
import com.zhenai.zadatamonitor.displayer.Displayer;
import com.zhenai.zadatamonitor.entity.ExampleRemoteData;

/**
 * Created by yintaibing on 2018/3/16.
 */

public class FloatWindowDisplayer implements Displayer<ExampleRemoteData> {
    @Override
    public void display(ExampleRemoteData data) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int getType() {
        return Constants.TYPE_EXAMPLE_REMOTE_DATA;
    }
}
