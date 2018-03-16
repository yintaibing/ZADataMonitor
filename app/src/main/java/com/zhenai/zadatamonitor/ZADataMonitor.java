package com.zhenai.zadatamonitor;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.zhenai.zadatamonitor.convertor.DataConvertor;
import com.zhenai.zadatamonitor.convertor.impl.ExampleDeviceInfoConvertor;
import com.zhenai.zadatamonitor.convertor.impl.ExampleRemoteDataConvertor;
import com.zhenai.zadatamonitor.displayer.Displayer;
import com.zhenai.zadatamonitor.entity.BaseData;
import com.zhenai.zadatamonitor.entity.ExampleDeviceInfo;
import com.zhenai.zadatamonitor.provider.ExampleDeviceInfoProvider;
import com.zhenai.zadatamonitor.provider.ExampleRemoteDataProvider;

import java.util.List;
import java.util.Map;

/**
 * Created by yintaibing on 2018/3/16.
 */

public class ZADataMonitor {
    private List<Displayer<? extends BaseData>> mDisplayers;
    private DataConvertor<Bundle, BaseData> mRemoteDataConvertor;
    private DataConvertor<Map<String, Object>, ExampleDeviceInfo> mLocalDataConvertor;

    public void init(Context context) {
        mRemoteDataConvertor = new ExampleRemoteDataConvertor();
        mLocalDataConvertor = new ExampleDeviceInfoConvertor();

        ExampleRemoteDataProvider remoteDataProvider = new ExampleRemoteDataProvider();
        remoteDataProvider.setListener(new ExampleRemoteDataProvider.OnReceiveListener() {
            @Override
            public void onReceive(Intent intent) {
                Bundle extras = intent.getExtras();
                BaseData converted = mRemoteDataConvertor.convert(extras);
                dispatchDisplay(converted);
            }
        });
        context.registerReceiver(remoteDataProvider, new IntentFilter("our action"));
    }

    public void addDisplayer(Displayer<? extends BaseData> displayer) {
        mDisplayers.add(displayer);
    }

    public void fetchDeviceInfo(Context applicationContext) {
        dispatchDisplay(mLocalDataConvertor.convert(
                new ExampleDeviceInfoProvider().getDeviceInfo(applicationContext)));
    }

    private void dispatchDisplay(BaseData data) {
        for (Displayer d : mDisplayers) {
            if ((d.getType() & data.getType()) != 0) {
                d.display(data);
            }
        }
    }
}
