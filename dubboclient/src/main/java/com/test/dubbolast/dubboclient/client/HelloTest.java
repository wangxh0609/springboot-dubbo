package com.test.dubbolast.dubboclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {
    @Autowired
    private  ClientService clientService;

    @RequestMapping("/do")
    public String greeting() {
        return clientService.doSomething();
    }
}