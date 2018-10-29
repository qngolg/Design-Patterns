package com.ex.pattern.factory.func;

import com.ex.pattern.factory.Mengniu;
import com.ex.pattern.factory.Milk;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
