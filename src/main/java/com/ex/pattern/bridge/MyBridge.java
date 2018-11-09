package com.ex.pattern.bridge;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSource().method();
    }
}
