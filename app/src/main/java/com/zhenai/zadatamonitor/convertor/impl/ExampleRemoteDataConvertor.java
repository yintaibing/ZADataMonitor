package com.zhenai.zadatamonitor.convertor.impl;

import android.os.Bundle;

import com.zhenai.zadatamonitor.Constants;
import com.zhenai.zadatamonitor.convertor.DataConvertor;
import com.zhenai.zadatamonitor.entity.BaseData;
import com.zhenai.zadatamonitor.entity.ExampleRemoteData;

/**
 * 示例远程数据转换器
 * 远端数据可能有多种类型，第2个泛型使用父类，不使用具体子类
 *
 * Created by yintaibing on 2018/3/16.
 */

public class ExampleRemoteDataConvertor implements DataConvertor<Bundle, BaseData> {
    @Override
    public BaseData convert(Bundle src) {
        int type = src.getInt("type");
        if (type == Constants.TYPE_EXAMPLE_REMOTE_DATA) {
            ExampleRemoteData result = new ExampleRemoteData();
            result.id = src.getInt("id");
            result.timestamp = src.getLong("timestamp");
            result.visible = src.getBoolean("visible");
            result.name = src.getString("name");
            return result;
        } else {
//            ...
        }
        return null;
    }
}
