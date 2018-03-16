package com.zhenai.zadatamonitor.convertor;

import com.zhenai.zadatamonitor.entity.BaseData;

/**
 * 数据转换器接口
 * S = source
 * R = result
 *
 * Created by yintaibing on 2018/3/16.
 */

public interface DataConvertor<S, R extends BaseData> {
    
    R convert(S src);
}
