package com.ex.pattern.proxy.aop;

/**
 * 该类是被代理类的接口类，
 * jdk的动态代理要求的接口，被代理类需要基于一个接口
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public interface Service {

    public void add();

    public void update();
}
