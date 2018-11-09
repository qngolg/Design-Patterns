package com.ex.pattern.decorator.v1;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class Test {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
