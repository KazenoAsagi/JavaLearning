package com.ydlclass.designPatterns.proxy.jdkDynamicProxy;

public class ManSinger implements Singer {
    
    public String name;
    
    public ManSinger(String name) {
        this.name = name;
    }
    
    @Override
    public void sing() {
        System.out.println(name + " 在唱歌……");
    }
}
