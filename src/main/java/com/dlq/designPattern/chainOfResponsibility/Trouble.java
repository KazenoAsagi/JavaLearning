package com.dlq.designPattern.chainOfResponsibility;

/**
 * @author KznAsg
 * @version 2022/9/19  下午 11:01
 * @page 163
 * @link
 */

public class Trouble {
    private final int number;
    
    public Trouble(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    @Override
    public String toString() {
        return "Trouble{" +
                     "number=" + number +
                     '}';
    }
}
