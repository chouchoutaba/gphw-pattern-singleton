package com.gphw.pattern.singleton.lazySingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 9:39
 */
public class LazyInnerClassSingleton {
//    private static LazyInnerClassSingleton INSTANCE;

    private LazyInnerClassSingleton(){
        if(LazyInnerClass.INSTANCE!=null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyInnerClass.INSTANCE;
    }

    private static class LazyInnerClass{
        private static LazyInnerClassSingleton INSTANCE=new LazyInnerClassSingleton();
    }
}
