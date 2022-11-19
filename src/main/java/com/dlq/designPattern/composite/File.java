package com.dlq.designPattern.composite;

/**
 * @author KznAsg
 * @version 2022/9/11  16:43
 * @page 120
 * @link
 */

public class File extends Entry {
    private final String name;
    private final int size;
    
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getSize() {
        return size;
    }
    
    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
