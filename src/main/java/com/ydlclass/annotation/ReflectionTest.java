package com.ydlclass.annotation;

public class ReflectionTest {
    public static void main(String[] args) {
        Class<?> aClass = null;
        try {
            aClass = Class.forName("com.ydlclass.annotation.DeprecatedTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        aClass.getDeclaredFields();
    }
}
