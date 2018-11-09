package com.ex.pattern.strategy.v1;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
