package com.ydlclass.designPatterns.proxy.staticProxyInterface;

public class Proxy implements Singer {
    Singer singer;
    
    public Proxy(Singer singer) {
        this.singer = singer;
    }
    
    @Override
    public void sing() {
        System.out.println("经纪人在揽业务……");
        singer.sing();
        System.out.println("经纪人在善后……");
    }
}
