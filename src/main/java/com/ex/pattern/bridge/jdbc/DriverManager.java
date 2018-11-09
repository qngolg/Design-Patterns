package com.ex.pattern.bridge.jdbc;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class DriverManager {

    private Driver driver;

    public Driver getDriver(){
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void connect(){
        driver.connect();
    }
}
