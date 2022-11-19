package com.dlq.designPattern.composite;

/**
 * @author KznAsg
 * @version 2022/9/11  16:45
 * @page
 * @link
 */

import java.util.ArrayList;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> entries = new ArrayList<>();
    
    public Directory(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : entries) {
            size += entry.getSize();
        }
        return size;
    }
    
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : entries) {
            entry.printList(prefix + "/" + this.name);
        }
    }
    
    public void add(Entry entry) {
        entries.add(entry);
    }
}
