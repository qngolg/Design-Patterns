package com.ex.pattern.proxy.dongtai.action;

import com.ex.pattern.proxy.staticed.action.Action;
import com.ex.pattern.proxy.staticed.action.RealObject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * 动态代理实现类   implements InvocationHandler
 * @Author qiangl
 * Created by qgl on 2018/8/23.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object realObject;

    public DynamicProxyHandler(Object realObject){
        this.realObject=realObject;
    }


    //invoke 方法中实现了代理类要扩展的公共功能
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy  do");
        return method.invoke(realObject,args);
    }


//    public static  <T> T getProxy(T t){
//        return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
//                new Class[]{t.getClass()},new DynamicProxyHandler(realObject));
//    }
    /**
     * 动态生成 + 代理模式
     * @param args
     */
    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        Action proxy = (Action)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Action.class},new DynamicProxyHandler(realObject));
        proxy.doSomething();
    }
}
