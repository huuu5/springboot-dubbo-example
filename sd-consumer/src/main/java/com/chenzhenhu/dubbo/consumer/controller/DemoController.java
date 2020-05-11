package com.chenzhenhu.dubbo.consumer.controller;

import com.chenzhenhu.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author john
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.sayHello("John");
    }
}
