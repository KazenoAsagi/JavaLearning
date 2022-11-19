package com.dlq.designPattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author KznAsg
 * @version 2022/9/17  下午 11:59
 * @page 149
 * @link
 */

public class Directory extends Entry implements Iterable<Entry> {
    private String name;
    private ArrayList<Entry> dirList = new ArrayList<>();
    
    public Directory(String name) {
        this.name = name;
    }
    
    public void add(Entry entry) {
        dirList.add(entry);
    }
    
    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : dirList) {
            size += entry.getSize();
        }
        return size;
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Iterator<Entry> iterator() {
        return dirList.iterator();
    }
}
