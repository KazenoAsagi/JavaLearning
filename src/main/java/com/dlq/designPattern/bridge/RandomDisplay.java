package com.dlq.designPattern.bridge;

/**
 * @author KznAsg
 * @version 2022/9/11  1:05
 * @page 102
 * @link
 */

import java.util.Random;

// 习题1
public class RandomDisplay extends CountDisplay {
    
    private Random random = new Random();
    
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void randomDisplay(int times) {
        // 我还以为要自己用random()做一些乘法和取整
        // double floor = Math.floor((Math.random() * times + 1));
        multiDisplay(random.nextInt(times));
    }
}
