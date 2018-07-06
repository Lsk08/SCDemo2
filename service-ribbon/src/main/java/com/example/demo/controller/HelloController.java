package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yuan on 2018/7/6.
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("hello")
    public String hello(){
        return helloService.hello();
    }
}
