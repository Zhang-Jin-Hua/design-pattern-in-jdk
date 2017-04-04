package com.smart;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 * <p>
 * Created by jinhua on 17-4-4.
 */
public class Singleton {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Runtime> runtimeClass = Runtime.class;

        Constructor<Runtime> runtimeConstructor = runtimeClass.getDeclaredConstructor();

        runtimeConstructor.setAccessible(true);

        System.out.println(Runtime.getRuntime() == runtimeConstructor.newInstance());
    }
}
