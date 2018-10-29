package com.ex.pattern.strategy.payport;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/25.
 */
public class ZhifubaoPay implements PayMent {

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }

}
