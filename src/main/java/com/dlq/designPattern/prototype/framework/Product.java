package com.dlq.designPattern.prototype.framework;

/**
 * @author KznAsg
 * @version 2022/8/22  13:57
 */
public interface Product extends Cloneable {
    void use(String s);
    
    Product createClone();
    
}
