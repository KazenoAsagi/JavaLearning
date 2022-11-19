package com.dlq.designPattern.bridge;

/**
 * @author KznAsg
 * @version 2022/9/11  1:11
 * @page
 * @link
 */

public class RandomDisplayTest {
    public static void main(String[] args) {
        RandomDisplay d = new RandomDisplay(new StringDisplayImpl("Hello China."));
        d.randomDisplay(10);
    }
}
