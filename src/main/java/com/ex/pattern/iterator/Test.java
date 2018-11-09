package com.ex.pattern.iterator;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
