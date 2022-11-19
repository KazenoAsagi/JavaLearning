package com.dlq.designPattern.adapter.delegation;

/**
 * @author KznAsg
 * @version 2022/8/27  15:42
 */
public class PrintBanner extends Print {
    // 拥有一个banner对象，用来调用它的方法，这是适应器用委托实现的做法
    private Banner banner;
    
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    
    @Override
    public void printWeak() {
        banner.showWithParen();
    }
    
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
