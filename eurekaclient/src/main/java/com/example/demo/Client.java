package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class Client {

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    public String hello(){
        return "hello world! I am from port:"+port;
    }
}
