package com.kuma.ribbon.balancedclient;

/**
 * Created by yuan on 2018/7/18.
 */
public class LoadBalanceInterceptor {

    private LoanBalanceClient loanBalanceClient= new LoanBalanceClient();

    public void intercept(){
        loanBalanceClient.execute();
    }
}
