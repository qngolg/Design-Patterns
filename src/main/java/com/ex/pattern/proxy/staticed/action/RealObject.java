package com.ex.pattern.proxy.staticed.action;

/**
 * 真实对象
 * @Author qiangl
 * Created by qgl on 2018/8/23.
 */
public class RealObject implements Action {
    @Override
    public void doSomething() {
        System.out.println("do Something");
    }

}
