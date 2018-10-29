package com.ex.pattern.proxy.dongtai.transformers;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class TransformersImpl implements Transformers{


    @Override
    public void trans2man() {
        System.out.println("----->transform to man");
    }

    @Override
    public void trans2car() {
        System.out.println("---->transform to car");
    }
}
