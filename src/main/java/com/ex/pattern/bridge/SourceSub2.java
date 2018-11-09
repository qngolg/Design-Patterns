package com.ex.pattern.bridge;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class SourceSub2 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
