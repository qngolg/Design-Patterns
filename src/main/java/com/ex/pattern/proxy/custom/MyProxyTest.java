package com.ex.pattern.proxy.custom;


import com.ex.pattern.proxy.dongtai.trainstation.SalePoint;
import com.ex.pattern.proxy.dongtai.trainstation.TrainStation;

import java.lang.reflect.Method;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/31.
 */
public class MyProxyTest implements MyInvocationHandler{

    private TrainStation proxyObject;

    public MyProxyTest(TrainStation proxyObject){
        this.proxyObject = proxyObject;
    }

    public Object newProxyInstance(){
        return MyProxy.newProxyInstance(new MyClassLoader(),proxyObject.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-------->myproxy invoke before");
        method.invoke(proxyObject,args);
        System.out.println("-------->myproxy invoke end");
        return null;
    }

    public static void main(String[] args) {

        MyProxyTest test = new MyProxyTest(new SalePoint());
        TrainStation proxy = (TrainStation) test.newProxyInstance();
        System.out.println(proxy.getClass().getName());
        proxy.buyTicket();

    }
}
