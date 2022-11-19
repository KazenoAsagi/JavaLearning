package com.dlq.designPattern.abstractFactory.listFactory;

import com.dlq.designPattern.abstractFactory.factory.Item;
import com.dlq.designPattern.abstractFactory.factory.Tray;

import java.util.Iterator;

/**
 * @author KznAsg
 * @version 2022/9/8  21:46
 * @page 82
 * @link
 */

public class ListTray<T> extends Tray {
    
    public ListTray(String caption) {
        super(caption);
    }
    
    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption).append("\n");
        sb.append("<ul>\n");
        Iterator<Item> iterator = tray.iterator();
        
        while (iterator.hasNext()) {
            Item item = iterator.next();
            sb.append(item.makeHTML());
        }
        
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
