package com.dlq.designPattern.chainOfResponsibility;

/**
 * @author KznAsg
 * @version 2022/9/19  下午 11:09
 * @page 165
 * @link
 */

public class OddSupport extends Support {
    
    public OddSupport(String name) {
        super(name);
    }
    
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
