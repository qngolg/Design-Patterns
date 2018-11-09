package com.ex.pattern.decorator;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/2.
 */
public class Demo {

    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();
        Decorator decorator = new ConcreteDecoratorA(c1);
        decorator.operation();
        System.out.println("----------------开始装饰------------------");
        Decorator decoratorBand = new ConcreteDecoratorA(decorator);
        decoratorBand.operation();
    }
}
