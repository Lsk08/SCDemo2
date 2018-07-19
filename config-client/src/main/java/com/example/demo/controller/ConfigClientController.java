package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuan on 2018/7/9.
 */
@RestController
public class ConfigClientController {

    //todo 无法通过eurekaserver注入变量??
    @Value("${foo}")
    String foo;

    @RefreshScope
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
