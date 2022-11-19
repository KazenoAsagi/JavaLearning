package com.dlq.designPattern.visitor;

/**
 * @author KznAsg
 * @version 2022/9/17  下午 11:58
 * @page 149
 * @link
 */

import com.dlq.designPattern.composite.FileTreatmentException;

import java.util.Iterator;

public class File extends Entry {
    private String name;
    private int size;
    
    public File(String name, int size) {
        this.name = name;
        this.size = size;
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
    public int getSize() {
        return size;
    }
    
    @Override
    public Iterator<Entry> iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }
}
