package com.gphw.pattern.singleton.localThreadSingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 10:30
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> INSTANCE = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public  static ThreadLocalSingleton getInstance(){return INSTANCE.get();}
}
