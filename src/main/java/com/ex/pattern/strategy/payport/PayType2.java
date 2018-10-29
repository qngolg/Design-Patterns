package com.ex.pattern.strategy.payport;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/25.
 */
public enum  PayType2 {

    Wechat("wechat"),zhifubao("zhifubao"),jd_pay("jd_pay");

    private String code;
    PayType2(String code){
        this.code = code;
    }

}
