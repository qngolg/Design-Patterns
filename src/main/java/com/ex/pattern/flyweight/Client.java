package com.ex.pattern.flyweight;

/**
 *  客户端类
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class Client {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        //此时的fly对象和第一个对象一致 实现了对象共享
        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }
}
