package com.dlq.programmerCarl.chapter5_hashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author KznAsg
 * @version 2022/9/7  10:09
 * @page 78
 * @link https://leetcode.cn/problems/intersection-of-two-arrays/solution/liang-ge-shu-zu-de-jiao-ji-by-leetcode-solution/
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        return getIntersection(set1, set2);
    }
    
    private int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1.size() > set2.size()) {
            return getIntersection(set2, set1);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        
        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] intersectionArray = new int[intersectionSet.size()];
        int index = 0;
        for (Integer num : intersectionSet) {
            intersectionArray[index] = num;
            index++;
        }
        return intersectionArray;
    }
}
