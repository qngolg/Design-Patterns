package com.ex.pattern.observer.v1;

/**
 *
 *  TODO 感觉可以用代理模式来设计观察者  让jvm虚拟机自己生成观察者对象
 * @Author qiangl
 * Created by qgl on 2018/10/29.
 */
public class UserEx  implements ObserverEx{

    private String name;
    private String message;

    public UserEx(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        readMessage();
    }

    private void readMessage(){
        System.out.println(name + "接收到推送消息：" + message);
    }
}
