package com.ex.pattern.factory.func;

import com.ex.pattern.factory.Milk;
import com.ex.pattern.factory.Sanlu;

/**
 * 当新增一个三鹿的时候
 * 工厂模式  需要新增三鹿工厂
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class SanluFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
