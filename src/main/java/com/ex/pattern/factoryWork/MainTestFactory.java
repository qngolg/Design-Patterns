package com.ex.pattern.factoryWork;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/12.
 */
public class MainTestFactory  {

    public static void main(String[] args) throws InterruptedException {
        BaseServiceFactory factory = new SeriviceFactory();
        BaseService service = factory.getBinJianService();
        System.out.println(service.excute());
    }
}
