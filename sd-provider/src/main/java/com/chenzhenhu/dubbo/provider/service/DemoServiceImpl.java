package com.chenzhenhu.dubbo.provider.service;

import com.chenzhenhu.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author john
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        return "hello! " + name;
    }
}
