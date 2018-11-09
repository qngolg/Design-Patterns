package com.ex.pattern.flyweight;

/**
 * @Author qiangl
 * Created by qgl on 2018/11/7.
 */
public class ConcreteFlyweight implements Flyweight {

   private Character intrinsicState = null;

    /**
     * 内部状态作为参数传入
     * @param state
     */
   public ConcreteFlyweight(Character state){
       this.intrinsicState = state;
   }

    /**
     * 外部状态作为参数传入方法，
     * @param state
     */
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic state = "  + this.intrinsicState);
        System.out.println("Extrinsic state = " + state);
    }

}
