package com.zhenai.zadatamonitor.convertor.impl;

import com.zhenai.zadatamonitor.convertor.DataConvertor;
import com.zhenai.zadatamonitor.entity.ExampleDeviceInfo;

import java.util.Map;

/**
 * 设备信息数据转换器
 * 设备信息就1种类型，第2个泛型使用具体子类
 *
 * Created by yintaibing on 2018/3/16.
 */

public class ExampleDeviceInfoConvertor implements DataConvertor<Map<String, Object>, ExampleDeviceInfo> {
    @Override
    public ExampleDeviceInfo convert(Map<String, Object> src) {
        return ExampleDeviceInfo.from(src);
    }
}
