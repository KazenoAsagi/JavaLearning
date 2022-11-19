package com.dlq.designPattern.bridge;

/**
 * @author KznAsg
 * @version 2022/9/11  0:51
 * @page 98
 * @link
 */

// 定义抽象方法的类
public abstract class DisplayImpl {
    
    public abstract void rawOpen();
    
    public abstract void rawPrint();
    
    public abstract void rawClose();
    
}
