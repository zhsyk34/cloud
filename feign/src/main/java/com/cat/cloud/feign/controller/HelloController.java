package com.cat.cloud.feign.controller;

import com.cat.cloud.feign.FeignClientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    FeignClientProxy clientProxy;

    @RequestMapping(value = "guide")
    public String guide(String name) {
        return clientProxy.guide(name);
    }

}