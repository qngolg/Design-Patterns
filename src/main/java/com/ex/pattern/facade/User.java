package com.ex.pattern.facade;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class User {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
