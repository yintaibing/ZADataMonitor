package com.zhenai.zadatamonitor.entity;

import com.zhenai.zadatamonitor.Constants;

/**
 * 示例远程数据
 *
 * Created by yintaibing on 2018/3/16.
 */

public class ExampleRemoteData implements BaseData {
    public int id;
    public long timestamp;
    public boolean visible;
    public String name;

    @Override
    public int getType() {
        return Constants.TYPE_EXAMPLE_REMOTE_DATA;
    }
}
