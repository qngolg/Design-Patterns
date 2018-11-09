package com.ex.pattern.strategy.v1;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class Demo {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
