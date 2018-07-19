package com.kuma.ribbon.timer;

import java.util.TimerTask;

/**
 * Created by yuan on 2018/7/18.
 */
public class PingServerTaks extends TimerTask {

    private IPingStratedy iPingStratedy=new DefaultPingStratedy();

    @Override
    public void run() {
        boolean alive=iPingStratedy.pingServer();
        System.out.println(alive);
    }
}
