package com.test.dubbolast.dubboserver;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.test.dubbolast.dubboserver.impl")
public class DubboserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboserverApplication.class, args);
    }
}
