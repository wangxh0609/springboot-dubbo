package com.test.dubbolast.dubboserver.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.IHelloService;

@Service(timeout = 5000)
public class HelloServiceImpl implements IHelloService {

    public String sayHello(String name) {
        return name;
    }
}
