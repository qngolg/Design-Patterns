package com.ex.pattern.adapter.v1;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("这是 targetable的方法");
    }
}
