package com.cat.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/guide")
    public String home(String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
