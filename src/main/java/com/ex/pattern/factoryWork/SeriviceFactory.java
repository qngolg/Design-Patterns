package com.ex.pattern.factoryWork;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/12.
 */
public class SeriviceFactory extends BaseServiceFactory {
    @Override
    public BaseService getBinJianService() {
        return new BinjianService();
    }

    @Override
    public BaseService getShilupanService() {
        return new ShilupanService();
    }
}
