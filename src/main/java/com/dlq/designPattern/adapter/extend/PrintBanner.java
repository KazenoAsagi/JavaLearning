package com.dlq.designPattern.adapter.extend;

/**
 * @author KznAsg
 * @version 2022/8/27  15:34
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    
    @Override
    public void printWeak() {
        showWithParen();
    }
    
    @Override
    public void printStrong() {
        showWithAster();
    }
}
