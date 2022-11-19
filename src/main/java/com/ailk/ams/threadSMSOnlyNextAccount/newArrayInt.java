package com.ailk.ams.threadSMSOnlyNextAccount;

/**
 * @author KznAsg
 * @version 2022/10/19  下午 3:02
 */

public class newArrayInt {
    public static void main(String[] args) {
        int[] ints = new int[10];
        // Arrays.fill(ints, 0);
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            System.out.println("anInt = " + anInt);
        }
        
        Integer[] integers = new Integer[10];
        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }
        
    }
}
