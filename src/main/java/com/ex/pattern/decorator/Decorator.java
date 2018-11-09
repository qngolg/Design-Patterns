package com.ex.pattern.decorator;

/**
 *  装饰器类
 * @Author qiangl
 * Created by qgl on 2018/11/2.
 */
public class Decorator extends Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
