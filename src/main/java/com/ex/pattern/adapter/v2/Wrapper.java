package com.ex.pattern.adapter.v2;

import com.ex.pattern.adapter.v1.Source;
import com.ex.pattern.adapter.v1.Targetable;

/**
 *
 *  对象的适配模式：持有Source类的实例，以达到解决兼容性的问题
 * @Author qiangl
 * Created by qgl on 2018/11/4.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the target method");
    }
}
