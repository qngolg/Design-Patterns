package com.ex.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class FlyweightFactory {

    //类似容器
    private Map<Character,Flyweight> files = new HashMap<>();

    //享元工厂方法
    public Flyweight factory(Character state){
        //先从缓存中查找对象
        Flyweight fly = files.get(state);
        if(fly == null){
            //如果对象不存在则创建新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state,fly);
        }
        return fly;
    }
}
