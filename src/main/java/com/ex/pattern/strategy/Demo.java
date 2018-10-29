package com.ex.pattern.strategy;

import com.ex.pattern.strategy.payport.PayType;
import com.ex.pattern.strategy.payport.WechatPay;
import com.ex.pattern.strategy.payport.ZhifubaoPay;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/25.
 */
public class Demo {

    public static void main(String[] args) {

        //简单策略模式，实现接口的方式，新增支付方式
//        Context context = new Context(new WechatPay());
//        context.executePay();
//
//        context = new Context(new ZhifubaoPay());
//        context.executePay();

        //高级策略模式
        Context context = new Context(PayType.jd_pay);
        context.executePay();

        Context context1 = new Context(PayType.Wechat_pay);
        context1.executePay();


    }
}
