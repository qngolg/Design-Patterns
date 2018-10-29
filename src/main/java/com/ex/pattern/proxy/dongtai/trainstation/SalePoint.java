package com.ex.pattern.proxy.dongtai.trainstation;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/24.
 */
public class SalePoint implements TrainStation{

    public SalePoint(){
        System.out.println("SalePoint  创建对象了");
    }

    @Override
    public void buyTicket() {
        System.out.println("buy  the train ticket");
    }
}
