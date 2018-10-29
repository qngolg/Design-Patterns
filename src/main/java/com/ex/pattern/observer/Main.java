package com.ex.pattern.observer;

/**
 * @Author qiangl
 * Created by qgl on 2018/10/29.
 */
public class Main {

    public static void main(String[] args) {

        User user = new User("aaa");
        User user1 = new User("bbb");

        WechatServer wechatServer = new WechatServer();
        //微信端更新服务端
        wechatServer.registerObserver(user);
        wechatServer.registerObserver(user1);
        //微信端发送消息
        wechatServer.setInfomation("你好");


    }
}
