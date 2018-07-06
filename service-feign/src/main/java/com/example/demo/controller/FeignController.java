package com.example.demo.controller;

import com.example.demo.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yuan on 2018/7/6.
 */
@RestController
public class FeignController {

    @Resource
    private FeignService feignService;

    @RequestMapping("hello")
    public String hello(){
        return feignService.hello();
    }
}
