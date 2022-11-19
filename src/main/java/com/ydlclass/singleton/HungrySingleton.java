package com.ydlclass.singleton;

public class HungrySingleton {
    // 这里添加想要的方法和属性
    
    private static final HungrySingleton INSTANCE = new HungrySingleton();
    
    private HungrySingleton() {
    }
    
    public static HungrySingleton getINSTANCE() {
        return INSTANCE;
    }
}
