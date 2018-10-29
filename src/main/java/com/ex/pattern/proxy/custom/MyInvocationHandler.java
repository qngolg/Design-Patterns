package com.ex.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/30.
 */
public interface MyInvocationHandler {

    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable;
}
