package com.ex.pattern.decorator;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/2.
 */
public class ConcreteDecoratorA extends Decorator {


    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void operationFirst(){
        System.out.println("opretionFirst say");
    }

    private void operationLast(){
        System.out.println("operationLast say");
    }

    public void operation(){
        operationFirst();
        super.operation();
        operationLast();
    }

    public void anotherOperation(){
        System.out.println("another operation");
    }
}
