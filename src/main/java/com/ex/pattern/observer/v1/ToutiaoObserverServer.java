package com.ex.pattern.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qiangl
 * Created by qgl on 2018/10/29.
 */
public class ToutiaoObserverServer implements ObserverServer {

    //1 要持有观察者列表  2 登记观察者 3推送消息 4 更新所以观察者消息

    private List<ObserverEx> observerServers;
    private String message;

    public ToutiaoObserverServer(){
        //新建一个Server的时候 初始化容器
        observerServers = new ArrayList<>();
    }


    /**
     * 登记观察者
     * @param o
     */
    @Override
    public void registerObserver(ObserverEx o) {
        observerServers.add(o);
    }

    /**
     * 移除观察者
     * @param o
     */
    @Override
    public void removeObserver(ObserverEx o) {
        //判断容器是否为空  并且包含该观察者
        if(observerServers.isEmpty() && observerServers.contains(o))
            observerServers.remove(o);
    }

    /**
     * 通知所以观察者
     */
    @Override
    public void notifyAllObserver() {
        for (ObserverEx o:observerServers) {
            o.update(message);
        }
    }

    /**
     * 推送消息
     * @param message
     */
    public void sendMessage(String message){
        this.message = message;
        notifyAllObserver();
    }
}
