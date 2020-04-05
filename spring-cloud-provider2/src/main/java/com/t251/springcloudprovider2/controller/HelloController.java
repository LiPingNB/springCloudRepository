package com.t251.springcloudprovider2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Value("${server.port}")
    private Integer port;
    @RequestMapping("/hello")
    public String  hello(@RequestParam String name){
       /* logger.info("request two name is "+name);
        try{
            Thread.sleep(10);
        }catch ( Exception e){
            logger.error(" hello two error",e);
        }*/
        return "hello："+name+",this is HelloController222，port:"+port;
    }

}
