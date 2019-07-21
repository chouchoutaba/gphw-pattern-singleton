package com.gphw.pattern.singleton;

import com.gphw.pattern.singleton.registrySingleton.EnumSingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 9:23
 */
public class ExecutorThread implements Runnable{
    @Override
    public void run() {
//        LazySingleton lazy = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton lazy = LazyDoubleCheckSingleton.getInstance();
//        LazyInnerClassSingleton lazy =LazyInnerClassSingleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+enumSingleton);
        enumSingleton.print(Thread.currentThread().getName());
    }
}
