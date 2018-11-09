package com.ex.pattern.iterator;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public interface Collection {

    /**
     * 获取迭代器
     * @return
     */
    public Iterator iterator();

    public Object get(int i);

    public int size();

}
