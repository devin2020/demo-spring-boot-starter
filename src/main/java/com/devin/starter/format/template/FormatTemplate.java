package com.devin.starter.format.template;

import com.devin.starter.format.processor.FormatProcessor;
import com.devin.starter.format.properties.FormatProperties;

/**
 * 格式化调用模版
 *
 * @author devin
 */
public class FormatTemplate {

    private FormatProperties properties;
    private FormatProcessor processor;

    public FormatTemplate(FormatProperties properties, FormatProcessor processor) {
        this.properties = properties;
        this.processor = processor;
    }

    public String doFormat(Object object) {
        StringBuilder sb = new StringBuilder();
        sb.append("FormatProperties map format result -> ").append(processor.format(properties.getInfo()));
        sb.append("<br/>");
        sb.append("user object format result -> ").append(processor.format(object));
        return sb.toString();
    }

}
