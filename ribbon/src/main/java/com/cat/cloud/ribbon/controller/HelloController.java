package com.cat.cloud.ribbon.controller;

import com.cat.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "guide")
    public String guide(String name) {
        return helloService.guide(name);
    }

}