package com.ex.pattern.proxy.dongtai;

import com.ex.pattern.proxy.dongtai.trainstation.SalePoint;
import com.ex.pattern.proxy.dongtai.trainstation.TrainStation;
import com.ex.pattern.proxy.dongtai.transformers.TransFormersImpl2;
import com.ex.pattern.proxy.dongtai.transformers.Transformers;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * 动态代理类
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class DynamicProxy implements InvocationHandler {

    private Object proxyObject;
    public DynamicProxy(Object proxyObject){
        this.proxyObject = proxyObject;
    }
    public Object newProxyInstance(){
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(),
                proxyObject.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---->dynamic invoke before");
        method.invoke(proxyObject,args);
        System.out.println("----->dynamic invoke after");
        return null;
    }


    public static void main(String[] args) throws IOException {
        //~~~~~~~~~~~~~~~~~~~~~~此为变形金刚接口的代理类~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        DynamicProxy dynamicProxy  = new DynamicProxy(new TransformersDynamicImpl());
//        TransformersDynamic proxy = (TransformersDynamic) dynamicProxy.newProxyInstance();
//        System.out.println("---->" + proxy.getClass());
//        proxy.trans2car();
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        proxy.trans2man();

//        DynamicProxy dynamicProxy  = new DynamicProxy(new TransFormersImpl2());
//        Transformers dynamic = (Transformers) dynamicProxy.newProxyInstance();
//        System.out.println("---->" + dynamic.getClass());
//        dynamic.trans2man();;
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        dynamic.trans2car();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        //~~~~~~~~~~~~~~~~~此为火车站代售点的代理类~~~~~~~~~~~~~~~~~~~~~~
        DynamicProxy dynamicProxy = new DynamicProxy(new SalePoint());
        TrainStation proxy = (TrainStation) dynamicProxy.newProxyInstance();
        System.out.println("--------->"+proxy.getClass());
        proxy.buyTicket();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        /**
         * 原理：
         * 1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取
         * 2、JDK Proxy类重新生成一个新的类，同时新的类要实现被代理类所有实现的所有的接口
         * 3、动态生成java代码，把新加的业务逻辑方法有一定的逻辑代码去调用
         * 4、编译新生成的java代码.class
         * 5、在重新加载到JVM中运行
         * 以上过程就叫字节码重组
         */

        byte[] bytes =
                ProxyGenerator.generateProxyClass("$Proxy0",
                        new Class[]{TrainStation.class});
        FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
        os.write(bytes);
        os.close();
    }



}
