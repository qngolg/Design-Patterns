package com.ex.pattern.iterator;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public interface Iterator {


    /**
     * 前移
     * @return
     */
    public Object previous();

    /**
     * 后移
     */
    public Object next();

    public boolean hasNext();

    /**
     * 获取第一个元素
     * @return
     */
    public Object first();


}
