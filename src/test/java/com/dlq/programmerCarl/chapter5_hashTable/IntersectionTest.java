package com.dlq.programmerCarl.chapter5_hashTable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntersectionTest {
    
    @Test
    void intersection() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2, 4};
        int[] intersectionArray = new Intersection().intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersectionArray));
    }
    
}