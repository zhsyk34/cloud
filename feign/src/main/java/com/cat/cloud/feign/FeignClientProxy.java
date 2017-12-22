package com.cat.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "CLIENT")
public interface FeignClientProxy {
    //这里需要指明参数?
    @RequestMapping(value = "/guide", method = RequestMethod.GET)
    String guide(@RequestParam("name") String name);
}