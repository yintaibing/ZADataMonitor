package com.zhenai.zadatamonitor.displayer.impl;

import android.support.v4.view.ViewPager;
import android.widget.TabHost;

import com.zhenai.zadatamonitor.Constants;
import com.zhenai.zadatamonitor.displayer.Displayer;
import com.zhenai.zadatamonitor.entity.BaseData;

import java.util.Map;

/**
 * Created by yintaibing on 2018/3/16.
 */

public class MultiListDisplayer implements Displayer<BaseData> {
    private TabHost mTabHost;
    private ViewPager mViewPager;// 或 List<Fragment>

    private Map<Class<? extends BaseData>, Displayer<BaseData>> mDisplayers;

    @Override
    public void display(BaseData data) {
        findDisplayer(data.getClass()).display(data);
    }

    @Override
    public void clear() {

    }

    @Override
    public int getType() {
        return Constants.TYPE_EXAMPLE_REMOTE_DATA | Constants.TYPE_EXAMPLE_DEVICE_INFO;
    }

    private Displayer<BaseData> findDisplayer(Class<? extends BaseData> dataClass) {
        Displayer<BaseData> displayer = mDisplayers.get(dataClass);
        if (displayer == null) {
//            Tab tab = addTab();
//            ListView listView = new ListView();
//            if (dataClass == ExampleRemoteData.class) {
//                displayer = new ListDisplayer(listView);
//            } else {
//                displayer = ...
//            }
//            mDisplayers.put(dataClass, displayer);
        }
        return displayer;
    }
}
