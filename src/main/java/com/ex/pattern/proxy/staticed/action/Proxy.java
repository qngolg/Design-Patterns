package com.ex.pattern.proxy.staticed.action;

/**
 *
 * 代理类
 * @Author qiangl
 * Created by qgl on 2018/8/23.
 */
public class Proxy implements Action {

    private Action realObject;

    public Proxy(Action realObject){
        this.realObject = realObject;
    }

    @Override
    public void doSomething() {
        System.out.println("proxy do");
        realObject.doSomething();
    }
}
