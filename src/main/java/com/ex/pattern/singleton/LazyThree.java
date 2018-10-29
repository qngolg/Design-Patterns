package com.ex.pattern.singleton;

/**
 *
 * 静态类模式
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class LazyThree {

    private static boolean initialized = false;

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没有使用的话，内部类是不加载的
    private LazyThree(){
        synchronized (LazyThree.class){
            if(initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已经被实例化");
            }
        }
    }

    private static class LazyHolder{
        private static  final LazyThree instance = new LazyThree();
    }

    public static final LazyThree getInstance(){


        return LazyHolder.instance;
    }


}
