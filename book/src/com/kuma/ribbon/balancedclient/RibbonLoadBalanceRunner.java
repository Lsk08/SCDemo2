package com.kuma.ribbon.balancedclient;

/**
 * Created by yuan on 2018/7/18.
 */
public class RibbonLoadBalanceRunner {

    public void apply(RestTemp restTemp){
        for(LoadBalanceInterceptor interceptor:restTemp.getLists()){
            interceptor.intercept();
        }
    }

}
