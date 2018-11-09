package com.ex.pattern.decorator;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/2.
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("ConcreteComponent say");
    }
}
