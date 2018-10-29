package com.ex.pattern.factory.func;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class FactoryTest {

    public static void main(String[] args) {

        //货比三家 不知道谁好谁坏
        //配置 可能配置错
        Factory factory = new MengniuFactory();
        System.out.println(factory.getMilk().getName());
    }
}
