package com.ex.pattern.factory.abstrct;

import com.ex.pattern.factory.Milk;

/**
 *
 * 抽象工厂是用户的主入口
 * 在Spring中应用的最为广泛的一种设计模式
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public abstract class AbstractFactory {


    /**
     * 获得一个蒙牛
     * @return
     */
    public  abstract Milk getMengniu();

    /**
     * 获得一个特仑苏
     * @return
     */
    public abstract Milk getTelunsu();

    /**
     * 获得一个三鹿
     * @return
     */
    public abstract Milk getSanlu();


}
