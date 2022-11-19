package com.dlq.designPattern.chainOfResponsibility;

/**
 * @author KznAsg
 * @version 2022/9/19  下午 11:08
 * @page 165
 * @link
 */

public class LimitSupport extends Support {
    private final int limit;
    
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < this.limit) {
            return true;
        } else {
            return false;
        }
    }
}
