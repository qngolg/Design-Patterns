package com.ex.pattern.proxy.cglib;

/**
 * 目标类  由于 cglib代理模式 是 对目标类的继承  所以目标类不能 final 修饰
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class UserDao {

    public UserDao(){
        System.out.println("创建对象了");
    }

    public void save(){
        System.out.println("保存数据");
    }
}
