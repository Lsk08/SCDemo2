package com.example.demo.controller;

import com.example.demo.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * Created by yuan on 2018/7/6.
 */
@Component
public class FeignControllerError implements FeignService {
    @Override
    public String hello() {
        return "feign,hello world Error！";
    }
}
