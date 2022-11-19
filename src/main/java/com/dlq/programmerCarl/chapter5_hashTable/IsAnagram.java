package com.dlq.programmerCarl.chapter5_hashTable;

import org.junit.Test;

/**
 * @author KznAsg
 * @version 2022/9/7  9:43
 * @page 76
 * @link LeetCode 242
 */
// 判断 s 中的字符是否可以通过改变顺序的方式 变成字符串 t
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        // 定义一个哈希表数组
        int[] record = new int[26];
        
        // 字符串 s 中的每一个字符让哈希表中元素 + 1
        // 使用 String 的 charAt() 方法，给定下标拿到 char
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }
        // 字符串 t 中的每一个字符让哈希表中元素 - 1
        // s 和 t 相互抵消
        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (record[i] != 0) {
                // 如果 record 数组中保存的数没有变成 0，那么在 s 和 t 中肯定有不一致的字符
                return false;
            }
        }
        return true;
        
    }
    
    @Test
    public void isAnagramTest() {
        String a = "abc";
        String b = "bcd";
        System.out.println(isAnagram(a, b));
        
    }
    
}
