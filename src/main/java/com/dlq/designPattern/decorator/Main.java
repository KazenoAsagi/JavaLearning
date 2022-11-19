package com.dlq.designPattern.decorator;

/**
 * @author KznAsg
 * @version 2022/9/14  下午 11:50
 * @page 135
 * @link
 */

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        
        Display b4 = new SideBorder(
              new FullBorder(
                    new FullBorder(
                          new SideBorder(
                                new FullBorder(
                                      new StringDisplay("你好，世界。")
                                ), '*')
                    )
              ), '/');
        b4.show();
    }
    
}
