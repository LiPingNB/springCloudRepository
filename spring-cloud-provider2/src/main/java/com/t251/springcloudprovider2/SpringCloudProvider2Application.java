package com.t251.springcloudprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//添加@EnableDiscoveryClient注解后，项目就具有了服务注册的功能
@EnableDiscoveryClient
public class SpringCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider2Application.class, args);
    }

}
