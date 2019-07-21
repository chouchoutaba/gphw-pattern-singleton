package com.gphw.pattern.singleton.registrySingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 10:14
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String name) {
        synchronized (map) {
            if(!map.containsKey(name)){
                Object obj=null;
                try {
                    Class clazz = Class.forName(name);
                    obj = clazz.newInstance();
                    map.put(name,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else{
                return map.get(name);
            }
        }
    }
}
