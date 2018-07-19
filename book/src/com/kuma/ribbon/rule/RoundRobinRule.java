package com.kuma.ribbon.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yuan on 2018/7/18.
 */
//用一个atomicInteger 保存index 每次+1 取模 从server列表中选择一个
public class RoundRobinRule {

    private AtomicInteger curIndex=new AtomicInteger(0);


    public Server choose(){
        List<Server> servers=getServers();

        if(servers.size()!=0){

            int index=getNextIndex(servers.size());
            return servers.get(index);

        }

        return null;
    }

//while + compareAndSet 实现无锁并发编程
    public int getNextIndex(int module){
        int cur;
        int next;
        do{
             cur=curIndex.get();
             next=(cur+1)%module;
        }while(!curIndex.compareAndSet(cur,next));

        return cur;
    }

    public List<Server> getServers(){
        List<Server> list=new ArrayList<>();
        list.add(new Server());
        list.add(new Server());
        list.add(new Server());
        list.add(new Server());
        list.add(new Server());
        return list;
    }
}
