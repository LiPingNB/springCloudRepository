package com.t251.springcloudprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private Integer port;
    @RequestMapping("/hello")
    public String  hello(@RequestParam String name){
        return "hello："+name+",this is HelloController1111，port:"+port;
    }

}
