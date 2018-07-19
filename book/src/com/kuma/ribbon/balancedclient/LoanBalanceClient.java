package com.kuma.ribbon.balancedclient;

/**
 * Created by yuan on 2018/7/18.
 */
public class LoanBalanceClient {

    RibbonRule ribbonRule=new RibbonRule();

    public void execute(){
        ribbonRule.choose();
        System.out.println("LoanBalanceClient execute");
    }
}
