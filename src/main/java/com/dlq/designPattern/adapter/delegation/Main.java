package com.dlq.designPattern.adapter.delegation;

/**
 * @author KznAsg
 * @version 2022/8/27  15:35
 */
public class Main {
    public static void main(String[] args) {
        Print printBanner = new PrintBanner("Hello");
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
