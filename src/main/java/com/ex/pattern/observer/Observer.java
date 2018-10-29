package com.ex.pattern.observer;

/**
 * @Author qiangl
 * Created by qgl on 2018/10/29.
 */
public interface Observer {

    //定义update方法，当被观察者调用notifyObservers(),观察者的update()会被回调
    public void updata(String message);
}
