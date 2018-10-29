package com.ex.pattern.singleton;

/**
 * 懒汉模式 加锁版 解决线程安全
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class LazySingletonByLock {

    private static LazySingletonByLock instance = null;

    private LazySingletonByLock(){
    }

    public static synchronized LazySingletonByLock getInstance(){
            if(instance == null){
                instance = new LazySingletonByLock();
            }
        return instance;
    }
}
