package com.t251.springcloudconsumerhystrixdashboard.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String  hello(@RequestParam String name);

}
