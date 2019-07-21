package com.gphw.pattern.singleton.hungrySingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 17:15
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){
        if(INSTANCE!=null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    /**
     * 唯一入口
     * @return
     */
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
