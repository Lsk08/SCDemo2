package com.example.demo.service;

import com.example.demo.controller.FeignControllerError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuan on 2018/7/6.
 */
@FeignClient(value="helloworld",fallback = FeignControllerError.class)
public interface FeignService {

    @RequestMapping("hello")
    String hello();
}
