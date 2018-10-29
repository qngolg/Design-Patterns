package com.ex.pattern.singleton.test;

import com.ex.pattern.singleton.LazySingleton;
import com.ex.pattern.singleton.LazySingletonByLock;

import java.util.concurrent.CountDownLatch;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class ThreadLazyTest {

//    //懒汉模式 线程不安全，同一时间产生多个对象
//    public static void main(String[] args) {
//        int count = 200;
//        CountDownLatch latch = new CountDownLatch(count);
//        for(int i = 0;i<count;i++){
//            new Thread(()->{
//                try {
//                    latch.await();
//                    //普通的懒汉模式
//                    Object instance = LazySingleton.getInstance();
//                    //加同步锁的懒汉模式  线程安全
////                    Object instance  = LazySingletonByLock.getInstance();
//                    System.out.println(System.currentTimeMillis() + ":" + instance);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//            latch.countDown();
//        }
//    }

    //加锁的懒汉模式  ，比较耗时，存在性能问题
    public static void main(String[] args) {
        int count = 2000000;
        long start = System.currentTimeMillis();
        for(int i = 0;i<count;i++){
                    //普通的懒汉模式
                    Object instance = LazySingleton.getInstance();
                    //加同步锁的懒汉模式  线程安全  但是比较耗时
//                    Object instance  = LazySingletonByLock.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end-start));
    }

}
