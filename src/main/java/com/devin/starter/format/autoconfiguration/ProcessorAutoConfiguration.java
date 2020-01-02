package com.devin.starter.format.autoconfiguration;

import com.devin.starter.format.processor.FormatProcessor;
import com.devin.starter.format.processor.JsonFormatProcessor;
import com.devin.starter.format.processor.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 处理类自动装配
 * 调用者依赖fastjson则使用JSON格式化字符串，不依赖则使用toString()
 *
 * @author devin
 */
@Configuration
public class ProcessorAutoConfiguration {

    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Primary
    @Bean
    public FormatProcessor json() {
        return new JsonFormatProcessor();
    }

    @Bean
    public FormatProcessor string() {
        return new StringFormatProcessor();
    }
}
