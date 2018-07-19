package com.example.demo.controller;

import com.example.demo.service.FeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yuan on 2018/7/6.
 */
@RestController
public class FeignController {

    protected static final Logger logger = LoggerFactory.getLogger(FeignController.class);

    @Resource
    private FeignService feignService;

    @RequestMapping("hello")
    public String hello(){
        //引入jar包后 日志会产生类似  [helloworld,d48cc80cda6976b6,014598f635be1f01,false] 的信息
        //分别代表 application.name spanId traceId 是否启用日志分析 true/false
        //通过 spring.sleuth.sampler.percentage=0.1 配置
        logger.info("feign-client:hello");
        return feignService.hello();
    }
}
