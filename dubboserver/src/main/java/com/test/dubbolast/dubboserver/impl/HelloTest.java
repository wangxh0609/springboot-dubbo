package com.test.dubbolast.dubboserver.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {
    @RequestMapping("/index")
    public String greeting() {
        return "hello spring boot ";
    }
}