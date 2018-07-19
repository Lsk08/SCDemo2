package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuan on 2018/7/10.
 */
@RestController
public class HiController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/foo")
    public String foo(){
        return  foo;
    }
}
