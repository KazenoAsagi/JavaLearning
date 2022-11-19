package com.dlq.designPattern.chainOfResponsibility;

/**
 * @author KznAsg
 * @version 2022/9/19  下午 11:09
 * @page 165
 * @link
 */

public class SpecialSupport extends Support {
    private final int number;
    
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }
    
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == this.number) {
            return true;
        } else {
            return false;
        }
    }
}
