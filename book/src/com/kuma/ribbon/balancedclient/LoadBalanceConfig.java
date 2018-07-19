package com.kuma.ribbon.balancedclient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan on 2018/7/18.
 */
//LoadBalanceConfig 通过扫描所有@LoadBalance的注解 加入interceptor
public class LoadBalanceConfig {

    //todo search resttmp that has annotation @LoanBalance and return
    private List<RestTemp> restTemps=new ArrayList<>();

    public List<RestTemp> getRestTemps() {
        return restTemps;
    }

    public void setRestTemps(List<RestTemp> restTemps) {
        this.restTemps = restTemps;
    }

    public void LoadBalanceAnnotation(){
        for(RestTemp restTemp:restTemps){
            //加入interceptor
            restTemp.getLists().add(new LoadBalanceInterceptor());
        }
    }
}
