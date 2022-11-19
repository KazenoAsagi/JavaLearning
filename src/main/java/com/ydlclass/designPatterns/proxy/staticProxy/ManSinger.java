package com.ydlclass.designPatterns.proxy.staticProxy;

public class ManSinger {
    
    private String name;
    
    public ManSinger(String name) {
        this.name = name;
    }
    
    
    public void sing() {
        System.out.println(name + " 正在唱歌…");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
