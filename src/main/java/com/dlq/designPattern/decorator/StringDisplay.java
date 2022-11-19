package com.dlq.designPattern.decorator;

/**
 * @author KznAsg
 * @version 2022/9/14  下午 11:32
 * @page
 * @link
 */

import java.nio.charset.StandardCharsets;

public class StringDisplay extends Display {
    private final String string;
    
    public StringDisplay(String string) {
        this.string = string;
    }
    
    /**
     * 返回字符串的长度
     * 有三种写法，分别会将汉字识别为3~4个字符和1个字符
     *
     * @return 字符串的长度
     */
    @Override
    public int getColumns() {
        // return string.getBytes(StandardCharsets.UTF_8).length;
        // return this.string.length();
        return string.getBytes(StandardCharsets.ISO_8859_1).length;
    }
    
    @Override
    public int getRows() {
        // 行数是1
        return 1;
    }
    
    @Override
    public String getRowText(int row) {
        // 仅当row为0时返回string
        return row == 0 ? string : null;
    }
}
