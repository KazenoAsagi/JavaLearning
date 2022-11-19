package com.ydlclass.singleton;

public class EnumSingleton {
    // 这里添加想要的方法和属性
    
    // 私有自己
    private EnumSingleton() {
    }
    
    public static EnumSingleton getInstance() {
        return SingletonHolder.INSTANCE.singleton;
    }
    
    // 私有枚举
    private enum SingletonHolder {
        // 保存一个枚举的内部属性 用来存单例对象
        INSTANCE;
        // 单例对象是它
        private final EnumSingleton singleton;
        
        SingletonHolder() {
            // 创建单例对象，也可以写在上面final的地方
            this.singleton = new EnumSingleton();
        }
    }
}
