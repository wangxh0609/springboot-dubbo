package com.test.dubbolast.dubboclient.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class ClientService {
    @Reference
    public IHelloService iHelloService;


    public String doSomething(){
        return iHelloService.sayHello("helloword");
    }
}
