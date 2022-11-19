package com.dlq.designPattern.bridge;

/**
 * @author KznAsg
 * @version 2022/9/11  0:50
 * @page 97
 * @link
 */

// 控制业务流程的类
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
