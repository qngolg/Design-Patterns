package com.ex.pattern.bridge.jdbc;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class Client {


    public static void main(String[] args) {

        DriverManager driverManager = new DriverManager();
        driverManager.setDriver(new MysqlDriver());
        driverManager.connect();

        driverManager.setDriver(new OracleDriver());
        driverManager.connect();

        driverManager.setDriver(new DB2Driver());
        driverManager.connect();
    }
}
