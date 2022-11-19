package com.dlq.designPattern.decorator;

/**
 * @author KznAsg
 * @version 2022/9/14  下午 11:30
 * @page 131
 * @link
 */

public abstract class Display {
    /**
     * @return 返回字符串的长度
     */
    public abstract int getColumns();
    
    /**
     * @return 返回字符串的行数
     */
    public abstract int getRows();
    
    /**
     * 返回这一行字符串的内容
     *
     * @param row 指定的行数
     * @return 返回这一行字符串的内容
     */
    public abstract String getRowText(int row);
    
    /**
     * 显示整个字符串
     */
    public final void show() {
        for (int i = 0; i < this.getRows(); i++) {
            System.out.println(this.getRowText(i));
        }
    }
}
