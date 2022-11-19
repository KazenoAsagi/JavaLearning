package com.dlq.designPattern.adapter.extend;

/**
 * @author KznAsg
 * @version 2022/8/27  15:31
 */
public class Banner {
    private String string;
    
    public Banner(String string) {
        this.string = string;
    }
    
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
