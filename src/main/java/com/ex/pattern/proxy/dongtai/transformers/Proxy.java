package com.ex.pattern.proxy.dongtai.transformers;

/**
 *
 * 此为静态代理
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class Proxy implements Transformers {

    private Transformers transformersDynamic;
    public Proxy(Transformers transformersDynamic){
        this.transformersDynamic = transformersDynamic;
    }

    @Override
    public void trans2man() {
        transformersDynamic.trans2man();
    }

    @Override
    public void trans2car() {
        transformersDynamic.trans2car();
    }

    public static void main(String[] args) {

//        Proxy proxy = new Proxy(new TransformersDynamicImpl());
//        proxy.trans2man();
//        proxy.trans2car();
        Proxy proxy = new Proxy(new TransFormersImpl2());
        proxy.trans2car();
        proxy.trans2man();
    }
}
