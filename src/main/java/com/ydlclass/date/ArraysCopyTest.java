package com.ydlclass.date;

import java.util.Arrays;

public class ArraysCopyTest {
    public static void main(String[] args) {
        int[] ints = {1, 11, 2, 3};
        // 1 包装方法
        int[] ints1 = Arrays.copyOf(ints, ints.length * 2);
        // 2 原始方法，写的复杂，更加灵活
        int[] ints2 = new int[ints.length * 2];
        System.arraycopy(ints, 0, ints2, 0, ints.length);
        
        // 3 范围拷贝
        int[] ints3 = Arrays.copyOfRange(ints, 2, 4);
        
    }
}
