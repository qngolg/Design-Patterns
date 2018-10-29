package com.ex.pattern.singleton;

/**
 * 静态内部类的单例模式
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class SingleTon {

    private SingleTon(){}

    /**
     * 外部类加载初始化的时候不会立即加载内部类，所以再初始化的时候 不占内存
     *
     */
    private static class SingleHolder{
        //static 利用java内存机制 保证了
        private final static SingleTon instance = new SingleTon();
    }

    public static SingleTon getInstance(){
        return SingleHolder.instance;
    }
}
