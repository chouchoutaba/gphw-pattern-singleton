package com.gphw.pattern.singleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 9:24
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();


    }
}
