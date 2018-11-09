package com.ex.pattern.decorator.v1;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("这是实现方法");
    }
}
