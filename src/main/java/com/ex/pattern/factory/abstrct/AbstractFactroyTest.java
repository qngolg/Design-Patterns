package com.ex.pattern.factory.abstrct;

/**
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class AbstractFactroyTest {

    public static void main(String[] args) {

        MilkFactory factory = new MilkFactory();
        //用户只有选择的权力 不会配置错
        System.out.println(factory.getMengniu());
    }
}
