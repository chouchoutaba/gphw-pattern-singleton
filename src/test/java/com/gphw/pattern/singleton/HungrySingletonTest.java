package com.gphw.pattern.singleton;

import com.gphw.pattern.singleton.hungrySingleton.HungrySingleton;

/**
 * @Author: Jiang
 * @Date: 2019/7/20 17:17
 */
public class HungrySingletonTest {
    public static void main(String[] args) throws Exception {
//        Class clazz = HungrySingleton.class;
//        Constructor c = clazz.getDeclaredConstructor();
//        c.setAccessible(true);

        System.out.println(HungrySingleton.getInstance());
    }
}
