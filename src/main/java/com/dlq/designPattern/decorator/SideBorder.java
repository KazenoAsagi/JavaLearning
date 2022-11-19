package com.dlq.designPattern.decorator;

/**
 * @author KznAsg
 * @version 2022/9/14  下午 11:36
 * @page134
 * @link
 */

public class SideBorder extends Border {
    private final char borderChar;
    
    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }
    
    /**
     * @return 被装饰字符串的字符数+边框的字符数（1+1）
     */
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }
    
    /**
     * @return 被装饰的行数
     */
    @Override
    public int getRows() {
        return display.getRows();
    }
    
    /**
     * @param row 指定某一行字符串作为被装饰的对象
     * @return 返回装饰完毕的字符串
     */
    @Override
    public String getRowText(int row) {
        // 加上两侧边框的字符
        return borderChar + display.getRowText(row) + borderChar;
    }
}
