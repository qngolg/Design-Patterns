package com.ex.pattern.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 发令枪
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class Demo {

    private static AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) {
        //测试懒汉模式创建效率
        int  size = 1000000000;
        long startTime = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            LazySingleton.getInstance();
        }
        System.out.println(size + " 个懒汉创建时间： " +(System.currentTimeMillis()-startTime));
        //测试饿汉模式创建效率
        long startTime2 = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            HungrySingleton.getInstance();
        }
        System.out.println(size + " 个饿汉创建时间： " +(System.currentTimeMillis()-startTime2));
        //测试内部类创建效率
        long startTime3 = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            SingleTon.getInstance();
        }
        System.out.println(size + " 个静态内部类创建时间： " +(System.currentTimeMillis()-startTime3));
//        //线程数量
//        final int size = 100;
//        CountDownLatch countDownLatch = new CountDownLatch(size);
//        CountDownLatch countDownLatch1 = new CountDownLatch(1);
//        for (int i = 0;i<size;i++){
//            //建立100个的线程，
//            new Thread(()->{
//                try {
//                    //通俗讲法：await()为线程预备阶段   等待发令枪响（size为0时），所有人准备完毕 100个线程开始赛跑
//                    //线程等待阶段，当countDown减为0的时候 100个线程同时启动 造成并发
//                    countDownLatch.await();
//                    //懒汉模式
//                    Object instance = LazySingleton.getInstance();
//                    System.out.println(System.currentTimeMillis() + ":" + instance);
//                    num.getAndIncrement();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//            //第i个人准备完毕，countDownLatch.countDown()就相当于size--1  此时的size是new CountDownLatch(size)的size;与线程数要一致
//            countDownLatch.countDown();
//        }
        /**
         *  失败方法  企图 用另外一个count down来阻塞主线程，
         *  完了让其他线程都跑完了 再运行此线程。
         *  结果 countDown==0的时候 只是所有线程开始跑了  并不代表所有线程结束
         */
//        new Thread(()->{
//            while (true){
//                if(countDownLatch.getCount() == 0){
//                    countDownLatch1.countDown();
//                    break;
//                }
//            }
//
//        }).start();
//        try {
//            countDownLatch1.await();
//            System.out.println("num ->" + num);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
