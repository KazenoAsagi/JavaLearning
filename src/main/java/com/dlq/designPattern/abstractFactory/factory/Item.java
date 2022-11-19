package com.dlq.designPattern.abstractFactory.factory;

/**
 * @author KznAsg
 * @version 2022/9/8  9:26
 * @page 77
 * @link
 */
public abstract class Item {
    protected String caption;
    
    public Item(String caption) {
        this.caption = caption;
    }
    
    public abstract String makeHTML();
}
