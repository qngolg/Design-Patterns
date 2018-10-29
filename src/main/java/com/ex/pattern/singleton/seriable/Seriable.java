package com.ex.pattern.singleton.seriable;

import java.io.Serializable;

/**
 *
 * 序列化单例模式
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class Seriable implements Serializable {

    public final static Seriable INSTANCE = new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }

    //实现序列化这个方法  实现线程安全
    private Object readResolve(){
        return INSTANCE;
    }

}
