package com.dlq.programmerCarl.chapter3;

import org.junit.Test;

// P36 二分查找
public class BinarySearch {
    // 数组 array 已经排序好，而且没有重复元素
    
    // 解法1: 搜索区间定义为 [left, right]
    protected int solve1(int[] array, int target) {
        // 搜索区间定义为 [left, right]
        int left = 0, right = array.length - 1;
        
        // 当 left == right 时，[left, right] 的区间仍然有意义，因此用 <= 而不是 <
        while (left <= right) {
            // ( 防止溢出的写法，等同于 (left + right) / 2
            int middle = left + (right - left) / 2;
            // 在 if中 更新 left和 right
            if (target < array[middle]) {
                // 如果 target 落在 array[middle] 的左侧，那么 target 应该在 [left, middle - 1]
                right = middle - 1;
            } else if (target > array[middle]) {
                // 落在右侧，则 target 应该在 [middle + 1, right]
                left = middle + 1;
            } else if (target == array[middle]) {
                // 找到目标值，返回下标 middle
                return middle;
            } else {
                // 未知错误
                throw new RuntimeException("未知错误！");
            }
        }
        // 没有找到值
        return -1;
    }
    
    @Test
    public void solve1Test() {
        int[] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }
        System.out.println("solve1(array1, 78) = " + solve1(array1, 78));
        
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 100 - i;
        }
        // 查找不到的原因：二分查找只能固定查找升序或降序的其中一种，这个写法是查找升序数组的。
        System.out.println("solve1(array2, 78) = " + solve1(array2, 78));
    }
    
    protected int solve2(int[] array, int target) {
        // 定义区间为 [left, right)
        int left = 0, right = array.length;
        
        // 当 left == right 的时候，[left, right) 就没有意义了，所以循环就不需要考虑这种情况，用 <。
        while (left < right) {
            // >>的写法 和 solve1的写法等价
            int middle = left + ((right - left) >> 1);
            if (target < array[middle]) {
                // 落在左侧，target在[left, middle)
                right = middle;
            } else if (target > array[middle]) {
                // 落在右侧，target在[middle+1, right)
                left = middle + 1;
            } else if (target == array[middle]) {
                return middle;
            } else {
                throw new RuntimeException("未知错误！");
            }
        }
        return -1;
    }
    
    @Test
    public void solve2Test() {
        int[] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }
        System.out.println("solve1(array1, 78) = " + solve2(array1, 78));
        
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 100 - i;
        }
        // 查找不到的原因：二分查找只能固定查找升序或降序的其中一种，这个写法是查找升序数组的。
        System.out.println("solve1(array2, 78) = " + solve2(array2, 78));
    }
}
