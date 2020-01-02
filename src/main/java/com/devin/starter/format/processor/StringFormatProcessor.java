package com.devin.starter.format.processor;

/**
 * 字符串格式化  toString
 *
 * @author devin
 */
public class StringFormatProcessor implements FormatProcessor {
    @Override
    public String format(Object object) {
        return object.toString();
    }
}
