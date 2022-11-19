package com.dlq.programmerCarl.chapter3;

import org.junit.Test;

// P42 长度最小的子数组
public class RemoveElementFromArray {
    protected int solveViolently(int[] array, int target) {
        int size = array.length;
        for (int i = 0; i < array.length; i++) {
            // 如果当前数字是需要移除的数字，那么把后面所有元素往前移动来覆盖它
            if (array[i] == target) {
                for (int j = i + 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }
    
    @Test
    public void solveViolentlyTest() {
        int[] ints = new int[]{1, 2, 3, 4, 5, 5, 5, 5, 9, 4, 7};
        System.out.println("ints.length = " + ints.length);
        System.out.println("solveViolently(ints, 5) = " + solveViolently(ints, 5));
        
    }
    
    protected int solveWithTwoPointers(int[] array, int target) {
        int slowPointer = 0;
        for (int fastPointer = 0; fastPointer < array.length; fastPointer++) {
            // 如果和我们想移除的元素不一样，那么这个元素自然是需要保留的了，所以放到数组的前面去，
            // 然后把这些需要保留的元素一个一个按顺序排好就可以了
            if (target != array[slowPointer]) {
                array[slowPointer] = array[fastPointer];
                slowPointer++;
            }
        }
        return slowPointer;
    }
}
