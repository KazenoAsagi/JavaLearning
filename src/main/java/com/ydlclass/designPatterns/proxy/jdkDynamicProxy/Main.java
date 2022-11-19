package com.ydlclass.designPatterns.proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        
        
        Singer singerProxy = (Singer) Proxy.newProxyInstance(
              Thread.currentThread().getContextClassLoader(),
              new Class[]{Singer.class},
              new ManSingerInvocationHandler(new ManSinger("林俊杰"))
        );
        
        singerProxy.sing();
    }
    
    private static class ManSingerInvocationHandler implements InvocationHandler {
        
        private Singer singer;
        
        public ManSingerInvocationHandler(Singer singer) {
            this.singer = singer;
        }
        
        /*
         * 动态代理需要传入的参数：
         * 1. 当前类的 ClassLoader
         * 2. 需要 proxy 去代理的接口
         * 3. InvocationHandler: 反射方法的工具类
         * */
        
        /*
         * public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
         * 用 singer 解释一下 InvocationHandler.invoke() 的参数
         * proxy: 反射生成的对象，也就是 singer
         * method: proxy 对象的方法，也就是 sing()
         * args: method 的参数，在这里 sing() 没有参数
         *  */
        
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("经纪人在揽业务……");
            // method.invoke(this.singer) 就是 sing.invoke(singer)
            method.invoke(this.singer);
            System.out.println("经纪人在善后……");
            return null;
        }
    }
}
