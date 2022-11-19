package com.dlq.designPattern.bridge;

/**
 * @author KznAsg
 * @version 2022/9/11  0:58
 * @page 99
 * @link
 */

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
