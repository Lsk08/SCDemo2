package com.kuma.ribbon.balancedclient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan on 2018/7/18.
 */
public class RestTemp extends LoanBalanceClient{

    private List<LoadBalanceInterceptor> lists=new ArrayList<>();

    private String uri="localhost:80";
    private String serviceId="default";

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public List<LoadBalanceInterceptor> getLists() {
        return lists;
    }

    public void setLists(List<LoadBalanceInterceptor> lists) {
        this.lists = lists;
    }
}
