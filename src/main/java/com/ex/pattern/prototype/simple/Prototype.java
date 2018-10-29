package com.ex.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 实现clone 浅克隆
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class Prototype implements  Cloneable {

   public String name;

   public List list = new ArrayList();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
