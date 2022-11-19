package com.dlq.designPattern.bridge;

/**
 * @author KznAsg
 * @version 2022/9/11  0:51
 * @page 98
 * @link
 */

import java.nio.charset.StandardCharsets;

// 完成实现的类
public class StringDisplayImpl extends DisplayImpl {
    private final String string;
    
    private final int width;
    
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes(StandardCharsets.UTF_8).length;
    }
    
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    
    @Override
    public void rawOpen() {
        printLine();
    }
    
    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }
    
    @Override
    public void rawClose() {
        printLine();
    }
}
