package com.dlq.designPattern.abstractFactory.factory;

import java.util.ArrayList;

/**
 * @author KznAsg
 * @version 2022/9/8  9:27
 * @page 78
 * @link
 */
public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<>();
    
    public Tray(String caption) {
        super(caption);
    }
    
    public void add(Item item) {
        tray.add(item);
    }
}
