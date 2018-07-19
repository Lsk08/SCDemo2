package com.kuma.ribbon.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yuan on 2018/7/18.
 */
//LoadBalancer中需要首先维护一个serverList用于选择 --> 在构造函数加入一个
public class BaseLoadBalancerDemo {

    private Timer lbTimer;
    private final long pingInterval=5000;

    public BaseLoadBalancerDemo(){
        setPingTask();
    }

    private void setPingTask(){
        lbTimer=new Timer("lbTimer",false);
        lbTimer.schedule(new PingServerTaks(),0L,pingInterval);
    }
}
