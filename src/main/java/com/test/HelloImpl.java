package com.test;


import javax.jws.WebService;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "HelloService", endpointInterface = "com.test.Hello")
public class HelloImpl implements Hello {

    public String sayHello(String name) {
        return "Hello," + name;
    }
}