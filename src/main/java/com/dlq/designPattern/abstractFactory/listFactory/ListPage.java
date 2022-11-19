package com.dlq.designPattern.abstractFactory.listFactory;
/**
 * @author KznAsg
 * @version 2022/9/8  21:53
 * @page
 * @link
 */

import com.dlq.designPattern.abstractFactory.factory.Item;
import com.dlq.designPattern.abstractFactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {
    
    public ListPage(String title, String author) {
        super(title, author);
    }
    
    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>").append(title).append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>").append(title).append("</h1>\n");
        sb.append("<ul>\n");
        
        Iterator<Item> iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>").append(author).append("</address>");
        sb.append("</body></html>\n");
        
        return sb.toString();
    }
}
