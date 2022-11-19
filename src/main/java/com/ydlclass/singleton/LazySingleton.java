package com.ydlclass.singleton;

// 在多线程中，无法保证INSTANCE的唯一性
public class LazySingleton {
    // 这里添加想要的方法和属性
    
    private static LazySingleton instance;
    
    private LazySingleton() {
    }
    
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
