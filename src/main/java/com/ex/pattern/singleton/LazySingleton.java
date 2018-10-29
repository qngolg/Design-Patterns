package com.ex.pattern.singleton;

/**
 * 懒汉模式 (用的时候再去new，延迟加载)
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
