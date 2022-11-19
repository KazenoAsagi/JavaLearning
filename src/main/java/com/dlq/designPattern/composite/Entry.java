package com.dlq.designPattern.composite;

/**
 * @author KznAsg
 * @version 2022/9/11  16:40
 * @page 120
 * @link
 */

public abstract class Entry {
    public abstract String getName();
    
    public abstract int getSize();
    
    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    
    protected abstract void printList(String prefix);
    
    @Override
    public String toString() {
        return getName() + ": {" + getSize() + "}";
    }
}
