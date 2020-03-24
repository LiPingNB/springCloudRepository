package com.t251.springcloudconsumer2hystrixdashboard.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer2",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String  hello2(@RequestParam String name);
}
