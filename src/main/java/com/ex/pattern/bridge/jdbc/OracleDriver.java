package com.ex.pattern.bridge.jdbc;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class OracleDriver implements Driver {
    @Override
    public void connect() {
        System.out.println("connect to  oracle");
    }
}
