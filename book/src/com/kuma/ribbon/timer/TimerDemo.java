package com.kuma.ribbon.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by yuan on 2018/7/18.
 */
//timer可以执行定时任务的线程池 包括一次性任务 和 循环定时任务
    //.schedule启动
public class TimerDemo {

    public static void main(String[] args) {
        Timer timer=new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer-task running 1"+System.currentTimeMillis());
            }
        },1000L);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer-task loop2"+System.currentTimeMillis());
            }
        },2000L,2000L);

    }
}
