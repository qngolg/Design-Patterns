package com.ex.pattern.singleton.test;

import com.ex.pattern.singleton.HungrySingleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class ThreadHungryTest {

    /**
     * 测试饿汉模式的线程安全问题（不存线程安全问题，所有实例都为同一个）
     */
    public static void main(String[] args) {

        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);

        final Set<HungrySingleton> syncSet = Collections.synchronizedSet(new HashSet<>());

        for (int i = 0;i<count;i++){
            new Thread(()->{
                HungrySingleton.getInstance();
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            latch.countDown();
        }
    }
}
