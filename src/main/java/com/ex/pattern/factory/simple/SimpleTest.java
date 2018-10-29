package com.ex.pattern.factory.simple;

/**
 *
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class SimpleTest {

    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();
        //可能会配置错
        System.out.println(factory.getMilk("mengniu").getName());

        //用户配置未知 的milk 可能会出错
        System.out.println(factory.getMilk("staticed").getName());

    }
}
