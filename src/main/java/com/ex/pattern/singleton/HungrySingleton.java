package com.ex.pattern.singleton;

/**
 * 饿汉模式（不管你用不用，都给你new出来，避免线程安全问题，但是会消耗空间）
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class HungrySingleton {

    private HungrySingleton(){}

    //先静态，后动态
    //先属性，后方法
    //先上后下
    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
//        System.out.println(System.currentTimeMillis()+":"+instance);
        return instance;
    }


}
