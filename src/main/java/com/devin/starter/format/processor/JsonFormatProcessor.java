package com.devin.starter.format.processor;

import com.alibaba.fastjson.JSON;

/**
 * fastjson格式化
 *
 * @author devin
 */
public class JsonFormatProcessor implements FormatProcessor {
    @Override
    public String format(Object object) {
        return JSON.toJSONString(object);
    }
}
