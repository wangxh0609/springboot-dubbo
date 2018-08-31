package com.test.dubbolast.dubboclient;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.test.dubbolast.dubboclient.client")
public class DubboclientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboclientApplication.class, args);
    }
}
