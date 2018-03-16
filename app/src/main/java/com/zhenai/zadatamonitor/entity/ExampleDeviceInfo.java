package com.zhenai.zadatamonitor.entity;

import com.zhenai.zadatamonitor.Constants;

import java.util.Map;

/**
 * 示例本地数据
 * <p>
 * Created by yintaibing on 2018/3/16.
 */

public class ExampleDeviceInfo implements BaseData {
    public static final String ANDROID_VERSION = "android_version";
    public static final String HAS_SDCARD = "has_sdcard";

    public int androidVersion;
    public boolean hasSDCard;

    @Override
    public int getType() {
        return Constants.TYPE_EXAMPLE_DEVICE_INFO;
    }

    public static ExampleDeviceInfo from(Map<String, Object> map) {
        ExampleDeviceInfo instance = new ExampleDeviceInfo();
        instance.androidVersion = (int) map.get(ANDROID_VERSION);
        instance.hasSDCard = (boolean) map.get(HAS_SDCARD);
        return instance;
    }
}
