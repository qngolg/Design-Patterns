package com.ex.pattern.observer.v1;

/**
 * @Author qiangl
 * Created by qgl on 2018/10/29.
 */
public interface ObserverServer {

    //注册观察者
    public void registerObserver(ObserverEx o);

    //移除观察者
    public void removeObserver(ObserverEx o);

    //推送消息给所以观察者
    public void notifyAllObserver();
}
