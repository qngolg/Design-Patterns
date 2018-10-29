package com.ex.pattern.strategy;

import com.ex.pattern.strategy.payport.PayType;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/25.
 */
public class Context {

    private PayType pay;

    //这个参数，完全可以用PayMent 这个接口来代替
    //为什么不用呢
    //这个枚举类 可以完美的解决的switch的过程，还有if else的过程
    public Context(PayType pay) { //PayType 就类似一个策略
        this.pay = pay;
    }

    public void executePay(){
        pay.get().pay();
    }
}
