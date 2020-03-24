package com.t251.springcloudconsumer2hystrixdashboard.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello2(@RequestParam(value = "name")String name) {
        return "hello2" +name+", this messge send failed ";
    }
}
