package com.zhenai.zadatamonitor;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zhenai.zadatamonitor.displayer.impl.FloatWindowDisplayer;
import com.zhenai.zadatamonitor.displayer.impl.MultiListDisplayer;

/**
 * Created by yintaibing on 2018/3/16.
 */

public class MainActivity extends Activity {
    private ZADataMonitor mZADataMonitor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mZADataMonitor = new ZADataMonitor();
        mZADataMonitor.init(getApplicationContext());
        mZADataMonitor.addDisplayer(new MultiListDisplayer());
        mZADataMonitor.addDisplayer(new FloatWindowDisplayer());
    }
}
