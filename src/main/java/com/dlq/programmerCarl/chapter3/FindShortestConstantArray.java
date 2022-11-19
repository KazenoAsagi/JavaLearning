package com.dlq.programmerCarl.chapter3;

import org.junit.Test;

// 长度最小的子数组 P42
public class FindShortestConstantArray {
    
    // 要求：子数组元素之和 >= targetSum
    protected int solveViolently(int[] array, int targetSum) {
        // 给返回值设置一个极大值，这样就不会干扰后面取较小值
        int result = Integer.MAX_VALUE;
        int currentArraySum = 0;
        int currentArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            currentArraySum = 0;
            for (int j = i; j < array.length; j++) {
                currentArraySum += array[j];
                // 一旦当前元素之和大于目标值，就更新结果，然后直接从下一个数字开始寻找子数组
                if (currentArraySum > targetSum) {
                    currentArrayLength = j - i + 1;
                    result = Math.min(result, currentArrayLength);
                    break;
                }
            }
        }
        if (result == Integer.MAX_VALUE) {
            return 0;
        } else {
            return result;
        }
    }
    
    @Test
    public void solveViolentlyTest() {
        int[] ints = {4, 6, 2, 4, 9, 8, 7};
        int s = 12;
        System.out.println("solveViolently(ints, s) = " + solveViolently(ints, s));
    }
    
    // 滑动窗口
    protected int slidingWindow(int[] array, int targetSum) {
        int result = Integer.MAX_VALUE;
        int currentArraySum = 0;
        int currentArrayLength = 0;
        int j = 0;
        
        // 滑动窗口右侧的移动：每次i循环将一个新数纳入窗口
        for (int i = 0; i < array.length; i++) {
            currentArraySum += array[i];
            // while循环中检查数字是不是满足题设，不满足的话这个窗口就结束了，进入下一个i循环
            // ( 由于每次j不会置零，所以使用while而不是for
            while (currentArraySum >= targetSum) {
                currentArrayLength = i - j + 1;
                result = Math.min(result, currentArrayLength);
                // 滑动窗口左侧的移动：每次将最左侧j位置的数踢出窗口，踢出以后让while检查数字是否大于目标
                currentArraySum -= array[j];
                j++;
            }
        }
        return result < Integer.MAX_VALUE ? result : 0;
    }
    
    // 力扣提交
    // protected int slidingWindow(int[] nums, int target) {
    //     int result = Integer.MAX_VALUE;
    //     int currentArraySum = 0;
    //     int currentArrayLength = 0;
    //     int j = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         // 滑动窗口右侧的移动：每次i循环将一个新数纳入窗口
    //         currentArraySum += nums[i];
    //         // while循环中检查数字是不是满足题设，不满足的话这个窗口就结束了，进入下一个i循环
    //         // ( 由于每次j不会置零，所以使用while而不是for
    //         while (currentArraySum >= target) {
    //             currentArrayLength = i - j + 1;
    //             result = Math.min(result, currentArrayLength);
    //             // 滑动窗口左侧的移动：每次将最左侧j位置的数踢出窗口，踢出以后让while检查数字是否大于目标
    //             currentArraySum -= nums[j];
    //             j++;
    //         }
    //     }
    //     return result < Integer.MAX_VALUE ? result : 0;
    // }
    
    
    @Test
    public void slidingWindowTest() {
        int[] ints = {4, 6, 2, 4, 9, 8, 7};
        int s = 12;
        System.out.println("slidingWindow(ints, s) = " + slidingWindow(ints, s));
    }
}
