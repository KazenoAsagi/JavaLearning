package com.ydlclass.designPatterns.proxy.staticProxy;

public class Main {
    public static void main(String[] args) {
        ManSinger Jay = new Proxy("周杰伦");
        Jay.sing();
    }
}
