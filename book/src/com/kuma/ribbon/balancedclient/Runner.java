package com.kuma.ribbon.balancedclient;

/**
 * Created by yuan on 2018/7/18.
 */
//具有@LoadBalance 的RestTemp 会被 LoadBalanceAutoConfig配置一个interceptor
    //然后在 RoundRobinLoadBalancedClient执行的时候就会首先执行interceptor 的方法 选择一个server
    //一个restTemp也会被封装成一个interceptor
    //也就是责任链模式
public class Runner {
    public static void main(String[] args) {

        LoadBalanceConfig loadBalanceConfig=new LoadBalanceConfig();

        RestTemp restTemp=new RestTemp();
        restTemp.setUri("localhost:80");
        restTemp.setServiceId("my_test_app");
        loadBalanceConfig.getRestTemps().add(restTemp);

        loadBalanceConfig.LoadBalanceAnnotation();

        RibbonLoadBalanceRunner ribbonLoadBalanceRunner=new RibbonLoadBalanceRunner();
        ribbonLoadBalanceRunner.apply(restTemp);


    }
}
