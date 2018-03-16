package com.zhenai.zadatamonitor.displayer;

import com.zhenai.zadatamonitor.entity.BaseData;

/**
 * 数据展示器接口
 *
 * Created by yintaibing on 2018/3/16.
 */

public interface Displayer<T extends BaseData> {
    void display(T data);

    void clear();

    int getType();
}
