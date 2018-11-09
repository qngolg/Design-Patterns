package com.ex.pattern.chainor;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name){
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "  deal!");
        if(getHandler() != null){
            getHandler().operator();
        }
    }
}
