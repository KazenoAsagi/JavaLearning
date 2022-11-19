package com.ydlclass.designPatterns.proxy.staticProxy;

public class Proxy extends ManSinger {
    public Proxy(String name) {
        super(name);
    }
    
    @Override
    public void sing() {
        System.out.println("清嗓子，");
        super.sing();
        System.out.println("行礼，下场。");
    }
}
