package com.ex.pattern.decorator.v1;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("方法前");
        source.method();
        System.out.println("方法后");
    }
}
