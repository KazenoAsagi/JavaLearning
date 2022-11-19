package com.ydlclass.singleton;

public class StaticClassSingleton_Lazy {
    // 这里添加想要的方法和属性
    
    // 私有构造1
    private StaticClassSingleton_Lazy() {
    }
    
    // 返回静态内部类中的单例
    // *调用时才会加载静态内部类，相当于懒汉式
    public static StaticClassSingleton_Lazy getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    private static class SingletonHolder {
        
        // 静态内部类里面创建单例，在类加载时生成
        private static final StaticClassSingleton_Lazy INSTANCE = new StaticClassSingleton_Lazy();
        
        // 私有构造2
        private SingletonHolder() {
        }
    }
}
