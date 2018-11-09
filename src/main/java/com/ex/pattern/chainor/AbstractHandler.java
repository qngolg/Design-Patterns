package com.ex.pattern.chainor;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler){
        this.handler = handler;
    }

}
