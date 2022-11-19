package com.dlq.designPattern.bridge;

/**
 * @author KznAsg
 * @version 2022/9/11  0:50
 * @page 97
 * @link
 */

// 委托方法实现的类
public class Display {
    private final DisplayImpl impl;
    
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    
    public void open() {
        impl.rawOpen();
    }
    
    public void print() {
        impl.rawPrint();
    }
    
    public void close() {
        impl.rawClose();
    }
    
    public final void display() {
        open();
        print();
        close();
    }
}
