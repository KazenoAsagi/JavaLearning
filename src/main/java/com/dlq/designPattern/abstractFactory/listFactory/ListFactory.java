package com.dlq.designPattern.abstractFactory.listFactory;

import com.dlq.designPattern.abstractFactory.factory.*;


public class ListFactory extends Factory {
    
    
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    
    @Override
    public Tray createTray(String caption) {
        return new ListTray<Item>(caption);
    }
    
    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
