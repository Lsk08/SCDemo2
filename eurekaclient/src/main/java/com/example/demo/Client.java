package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class Client {

    protected static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    public String hello(){
        logger.info("eureka-client:/hello");
        return "hello world! I am from port:"+port;
    }
}
