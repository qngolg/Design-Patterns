package com.ex.pattern.prototype.deep;

import java.util.Date;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/12.
 */
public class QiTianDaSheng extends Monkey implements Cloneable{
    public QiTianDaSheng(int height) {
        this.birthday  = new Date().getTime();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
