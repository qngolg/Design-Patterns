package com.ex.pattern.strategy.payport;

/**
 * 支付类型枚举
 * @Author qiangl
 * Created by qgl on 2018/8/25.
 */
public enum PayType {

    Wechat_pay("wechat",new WechatPay()),
    jd_pay("jd",new JDPay()),
    zhifubao_pay("zhifubao",new ZhifubaoPay());

    private PayMent payMent;
    private String code;
    PayType(String code,PayMent payment){
        this.payMent = payment;
        this.code = code;
    }

    public PayMent get(){
        return this.payMent;
    }

    public PayType getCode(String code){
        return this;
    }

    public PayMent get(String code){
        return this.getCode(code).get();
    }


}
