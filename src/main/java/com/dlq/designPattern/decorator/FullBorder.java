package com.dlq.designPattern.decorator;

/**
 * @author KznAsg
 * @version 2022/9/14  下午 11:40
 * @page 134
 * @link
 */

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    
    /**
     * 工具方法：
     * 连续显示某一个指定字符
     *
     * @param ch    指定的字符
     * @param count 重复的次数
     * @return 拼接完成的字符串
     */
    private String makeLine(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
        // return String.valueOf(ch).repeat(Math.max(0, count));
    }
    
    /**
     * 返回字符串的单行长度
     *
     * @return 加上装饰字符后的长度
     */
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }
    
    /**
     * 返回字符串的行数
     *
     * @return 加上装饰行后的行数
     */
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }
    
    /**
     * 返回其中某一行字符串
     *
     * @param row 指定的行数
     * @return 指定的这一行字符串
     */
    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
}
