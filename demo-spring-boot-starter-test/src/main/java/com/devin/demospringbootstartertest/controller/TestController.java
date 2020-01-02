package com.devin.demospringbootstartertest.controller;

import com.devin.demospringbootstartertest.domain.User;
import com.devin.starter.format.template.FormatTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试format不同模版实现
 * 分别引入fastjson和不引入，接口输出结果不同
 *
 * @author devin
 */
@RestController
public class TestController {

    private FormatTemplate formatTemplate;

    public TestController(FormatTemplate formatTemplate) {
        this.formatTemplate = formatTemplate;
    }

    @GetMapping("/format")
    public String format(User user) {
        return formatTemplate.doFormat(user);
    }

}
