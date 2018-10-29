package com.ex.pattern.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册模式的单例模式
 * @Author qiangl
 * Created by qgl on 2018/8/11.
 */
public class RegisterMap {

    private static Map<String,Object> register = new HashMap<>();

    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getName();
        }
        if(register.get(name) == null){
            register.put(name,new RegisterMap());
        }
        return (RegisterMap) register.get(name);
    }
}
