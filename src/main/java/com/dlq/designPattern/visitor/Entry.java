package com.dlq.designPattern.visitor;

/**
 * @author KznAsg
 * @version 2022/9/17  下午 11:56
 * @page 148
 * @link
 */

import com.dlq.designPattern.composite.FileTreatmentException;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();
    
    public abstract int getSize();
    
    // 修改为void返回类型
    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    
    public abstract Iterator<Entry> iterator() throws FileTreatmentException;
    
    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
