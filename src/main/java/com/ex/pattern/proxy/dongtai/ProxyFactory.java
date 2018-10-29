package com.ex.pattern.proxy.dongtai;

import com.ex.pattern.proxy.dongtai.trainstation.SalePoint;
import com.ex.pattern.proxy.dongtai.trainstation.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的代理工厂
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class ProxyFactory {

    //维护目标类
    private  Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("开启事务");
                Object returnValue = method.invoke(target,args);
                System.out.println("提交事务");
                return null;
            }
        });
    }


    public static void main(String[] args) {
        SalePoint salePoint = new SalePoint();
        System.out.println("目标类是--->" + salePoint.getClass());
        TrainStation proxy  = (TrainStation) new ProxyFactory(salePoint).getProxyInstance();
        System.out.println("实际执行方法的类--->" + proxy.getClass());
        proxy.buyTicket();

    }


}
