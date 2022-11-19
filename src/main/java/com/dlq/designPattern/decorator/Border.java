package com.dlq.designPattern.decorator;

/**
 * @author KznAsg
 * @version 2022/9/14  下午 11:35
 * @page 132
 * @link
 */

public abstract class Border extends Display {
    protected Display display;
    
    protected Border(Display display) {
        this.display = display;
    }
}
