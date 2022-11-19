package com.dlq.designPattern.abstractFactory.factory;

/**
 * @author KznAsg
 * @version 2022/9/8  9:27
 * @page 78
 * @link
 */
public abstract class Link extends Item {
    
    protected String url;
    
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
