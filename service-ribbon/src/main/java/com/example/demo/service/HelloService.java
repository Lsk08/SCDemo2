package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by yuan on 2018/7/6.
 */
@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;
//服务调用通过服务名/接口
    //todo post
    @HystrixCommand(fallbackMethod = "helloError")//如果某个服务不可用 直接返回fallback的结果 一定次数之后流量不再经过这个服务 知道服务开启
    public String hello(){
        return restTemplate.getForObject("http://helloworld/hello",String.class);
    }

    public String helloError() {
        return "hello world Error!";
    }
}

