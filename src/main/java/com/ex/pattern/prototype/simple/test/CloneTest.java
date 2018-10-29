package com.ex.pattern.prototype.simple.test;

import com.ex.pattern.prototype.simple.Prototype;

import java.io.ObjectInputStream;
import java.util.Properties;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class CloneTest {

    public static void main(String[] args) {

        Prototype p = new Prototype();
        p.name= "Tom";
        p.list.add("1");

        try {
            Prototype p2 = (Prototype) p.clone();
            System.out.println(p2.name);
            System.out.println(p2.list.size());

            System.out.println(p == p2);
            //浅clone 之后 其内部对象 依然相等
            System.out.println(p.list == p2.list);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }
}
