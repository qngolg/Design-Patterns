package com.ex.pattern.singleton.test;

import com.ex.pattern.singleton.LazyThree;
import com.ex.pattern.singleton.register.RegisterEnum;
import com.ex.pattern.singleton.seriable.Seriable;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class ThreadLazyTestTwo {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
//
//        Class<?> clazz = LazyThree.class;
//        Constructor []cs = clazz.getDeclaredConstructors();
//        for (Constructor c : cs){
//            c.setAccessible(true);
//            Object o = c.newInstance();
//        }


//        RegisterEnum.INSTANCE.getInstance();


        //序列化单例模式
        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
