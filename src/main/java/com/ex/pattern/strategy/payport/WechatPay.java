package com.ex.pattern.strategy.payport;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/25.
 */
public class WechatPay implements PayMent {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
