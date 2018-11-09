package com.ex.pattern.bridge;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public abstract class Bridge {

    private Sourceable source;

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source = source;
    }
    public void method(){
        source.method();
    }

}
