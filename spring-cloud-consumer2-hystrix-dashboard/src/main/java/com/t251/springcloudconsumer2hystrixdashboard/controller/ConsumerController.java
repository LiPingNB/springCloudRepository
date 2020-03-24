package com.t251.springcloudconsumer2hystrixdashboard.controller;

import com.t251.springcloudconsumer2hystrixdashboard.remote.HelloRemote;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private HelloRemote helloRemote;
    @RequestMapping("/hello/{name}")
    public String hello2(@PathVariable("name")String name){
        return helloRemote.hello2(name);
    }
}
