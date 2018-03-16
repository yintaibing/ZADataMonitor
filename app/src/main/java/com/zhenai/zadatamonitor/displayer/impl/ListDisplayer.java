package com.zhenai.zadatamonitor.displayer.impl;

import android.widget.ListView;

import com.zhenai.zadatamonitor.displayer.Displayer;
import com.zhenai.zadatamonitor.entity.BaseData;

/**
 * Created by yintaibing on 2018/3/16.
 */

public abstract class ListDisplayer implements Displayer<BaseData> {
    private ListView mListView;
}
