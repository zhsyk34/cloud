package com.cat.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "onError")//断路由
    public String guide(String name) {
        return restTemplate.getForObject("http://CLIENT/guide?name=" + name, String.class);
    }

    public String onError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}