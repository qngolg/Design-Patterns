package com.ex.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB原理：动态生成一个要代理类的子类，子类重写要代理的类的所有不是final的方法。
 * 在子类中采用方法拦截的技术拦截所有父类方法的调用，
 * 顺势织入横切逻辑。它比使用java反射的JDK动态代理要快。
 *
 * CGLIB底层：使用字节码处理框架ASM，来转换字节码并生成新的类。
 * 不鼓励直接使用ASM，因为它要求你必须对JVM内部结构包括class文件的格式和指令集都很熟悉。
 *
 *
 * CGLIB缺点：对于final方法，无法进行代理。
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class ProxyCglibFactory implements MethodInterceptor {

    private Object target;

    public ProxyCglibFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(target.getClass());
        //设置回调函数
        en.setCallback(this);
        //创建子类对象代理
        return en.create();
    }


    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开启事务管理");
        //执行目标对象的方法
        Object returnValue = method.invoke(target,args);
        System.out.println("关闭事务");
        return null;
    }

    public static void main(String[] args) {

        //目标对象
        UserDao target = new UserDao();
        System.out.println("target------>"+target.getClass());
        //代理对象
        UserDao proxy = (UserDao) new ProxyCglibFactory(target).getProxyInstance();
        System.out.println("proxy------>"+proxy.getClass());
        proxy.save();
    }
}
