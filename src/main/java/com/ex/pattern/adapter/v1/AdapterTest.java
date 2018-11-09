package com.ex.pattern.adapter.v1;

/**
 *
 * 核心思想：有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过
 * Adapter类，将Source的功能扩展到Targetable里，
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
