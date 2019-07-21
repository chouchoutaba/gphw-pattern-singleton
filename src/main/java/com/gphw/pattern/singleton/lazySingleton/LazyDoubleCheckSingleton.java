package com.gphw.pattern.singleton.lazySingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 9:34
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton INSTANCE;
    private LazyDoubleCheckSingleton(){}

    public  static LazyDoubleCheckSingleton getInstance(){
        if(INSTANCE==null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
