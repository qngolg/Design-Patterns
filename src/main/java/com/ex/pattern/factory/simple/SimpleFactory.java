package com.ex.pattern.factory.simple;

import com.ex.pattern.factory.Mengniu;
import com.ex.pattern.factory.Milk;
import com.ex.pattern.factory.Telunsu;

/**
 * 牛奶生产工厂 (简单工厂 )
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class SimpleFactory {

    //当配置一个三路的时候 需要改方法
    public Milk getMilk(String name){
        //可能或配置错
        switch (name){
            case "mengniu":
                return new Mengniu();
            case "telunsu":
                return new Telunsu();
        }
        return null;
    }
}
