package com.ex.pattern.factory.func;

import com.ex.pattern.factory.Milk;
import com.ex.pattern.factory.Telunsu;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
