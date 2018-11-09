package com.ex.pattern.flyweight.v2;

import com.ex.pattern.flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    //享元聚集
    private Map<Character,Flyweight> files = new HashMap<>();

    /**
     * 增加新的享元到聚集中
     * @param key
     * @param fly
     */
    public void add(Character key,Flyweight fly){
        files.put(key,fly);
    }

    /**
     * 外部状态传入方法中
     * @param state
     */
    @Override
    public void operation(String state) {
        Flyweight fly = null;
        for (Object o:files.keySet()) {
            fly = files.get(o);
            fly.operation(state);
        }
    }
}
