package com.ex.pattern.observer;

/**
 *
 * @Author qiangl
 * Created by qgl on 2018/10/29.
 */
public interface Observerable {

    //登记观察者
    public void registerObserver(Observer o);
    //删除观察者
    public void removeObserver(Observer o);
    //
    public void notifyObserver();

}
