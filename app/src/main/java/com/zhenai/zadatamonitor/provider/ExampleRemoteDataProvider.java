package com.zhenai.zadatamonitor.provider;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by yintaibing on 2018/3/16.
 */

public class ExampleRemoteDataProvider extends BroadcastReceiver {
    private OnReceiveListener mListener;

    @Override
    public void onReceive(Context context, Intent intent) {
        mListener.onReceive(intent);
    }

    public void setListener(OnReceiveListener l) {
        mListener = l;
    }
    public interface OnReceiveListener {
        void onReceive(Intent intent);
    }
}
