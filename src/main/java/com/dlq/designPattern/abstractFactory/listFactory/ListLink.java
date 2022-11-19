package com.dlq.designPattern.abstractFactory.listFactory;

import com.dlq.designPattern.abstractFactory.factory.Link;

/**
 * @author KznAsg
 * @version 2022/9/8  21:44
 * @page 82
 * @link
 */

public class ListLink extends Link {
    
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    
    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
