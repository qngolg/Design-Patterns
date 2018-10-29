package com.ex.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，微信公众号服务
 * @Author qiangl
 * Created by qgl on 2018/10/29.
 */
public class WechatServer implements Observerable {

    //观察者集合
    private List<Observer> observerList;
    private String message;

    //初始化
    public WechatServer(){
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!observerList.isEmpty())
            observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.updata(message);
        }
    }

    public void setInfomation(String s){
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        notifyObserver();
    }
}
