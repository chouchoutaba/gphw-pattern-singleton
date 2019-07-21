package com.gphw.pattern.singleton.registrySingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 9:48
 */
public enum  EnumSingleton {
    INSTANCE;

    public Object getData() {
        return data;
    }

    Object data;


    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public void print(String name){
        System.out.println("name=="+name);
    }
}
