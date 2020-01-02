package com.devin.starter.format.autoconfiguration;

import com.devin.starter.format.processor.FormatProcessor;
import com.devin.starter.format.properties.FormatProperties;
import com.devin.starter.format.template.FormatTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 格式化自动装配类
 *
 * @author devin
 */
@Import({ProcessorAutoConfiguration.class})
@EnableConfigurationProperties(FormatProperties.class)
@Configuration
public class FormatAutoConfiguration {

    @Bean
    public FormatTemplate template(FormatProperties properties, FormatProcessor processor) {
        return new FormatTemplate(properties, processor);
    }
}
