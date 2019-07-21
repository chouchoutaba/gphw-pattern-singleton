package com.gphw.pattern.singleton.lazySingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 8:55
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;
    private LazySingleton(){}

    public synchronized static LazySingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE=new LazySingleton();
        }
        return INSTANCE;
    }
}
