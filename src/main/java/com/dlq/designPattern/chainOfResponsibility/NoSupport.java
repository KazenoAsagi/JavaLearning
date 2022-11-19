package com.dlq.designPattern.chainOfResponsibility;

/**
 * @author KznAsg
 * @version 2022/9/19  下午 11:08
 * @page 164
 * @link
 */

public class NoSupport extends Support {
    
    public NoSupport(String name) {
        super(name);
    }
    
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
