package com.devin.starter.format.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 自动装配自定义属性信息
 * com.devin.info
 *
 * @author devin
 */
@ConfigurationProperties(prefix = "com.devin")
public class FormatProperties {

    private Map<String, Object> info = new HashMap<>();

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
