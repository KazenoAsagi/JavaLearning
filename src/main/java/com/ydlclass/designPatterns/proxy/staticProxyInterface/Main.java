package com.ydlclass.designPatterns.proxy.staticProxyInterface;

public class Main {
    public static void main(String[] args) {
        ManSinger Eason = new ManSinger("陈奕迅");
        Proxy proxy = new Proxy(Eason);
        proxy.sing();
    }
}
