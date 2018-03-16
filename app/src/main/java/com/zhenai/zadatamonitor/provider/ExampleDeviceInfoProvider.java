package com.zhenai.zadatamonitor.provider;

import android.content.Context;

import com.zhenai.zadatamonitor.entity.ExampleDeviceInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * 设备信息提供者
 * <p>
 * Created by yintaibing on 2018/3/16.
 */

public class ExampleDeviceInfoProvider {
    public Map<String, Object> getDeviceInfo(Context context) {
        // 调用各种工具类、系统api，收集系统信息
        Map<String, Object> map = new HashMap<>();
        map.put(ExampleDeviceInfo.ANDROID_VERSION, 26);
        map.put(ExampleDeviceInfo.HAS_SDCARD, true);
        return map;
    }
}
