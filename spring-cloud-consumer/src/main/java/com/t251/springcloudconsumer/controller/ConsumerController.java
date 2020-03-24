package com.t251.springcloudconsumer.controller;

import com.t251.springcloudconsumer.remote.HelloRemote;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private HelloRemote helloRemote;
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name")String name){
        return helloRemote.hello(name);
    }
}
