package com.ydlclass.designPatterns.factories.factory;

public class Mate50 implements HuaweiPhone {
    
    public Mate50() {
    
    }
    
    @Override
    public void call() {
        // ....
        System.out.println("Mate50.call");
        System.out.println("Making a Call");
        // ...
    }
}
