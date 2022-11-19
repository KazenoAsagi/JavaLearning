package com.dlq.programmerCarl.chapter6_string;

/**
 * @author KznAsg
 * @version 2022/9/19  下午 11:22
 * @page 104
 * @link
 */

public class StrStr_minus1 {
    
    public void getNext(int[] next, String s) {
        int j = -1;
        next[0] = j;
        // i 从 1 开始
        for (int i = 1; i < s.length(); i++) {
            // 如果前后缀不相同
            while (j >= 0 && s.charAt(i) != s.charAt(j - 1)) {
                // 向前回退
                j = next[j];
            }
            // 找到相同的前后缀
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            // 将前缀的长度赋给next[i]
            next[i] = j;
        }
    }
    
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = new int[needle.length()];
        getNext(next, needle);
        
        // next数组中记录的起始位置为-1
        int j = -1;
        // i 从 0 开始
        for (int i = 0; i < haystack.length(); i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) {
                // j去寻找之前匹配的位置
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j + 1)) {
                // i的增加逻辑写在for中
                j++;
            }
            // 如果haystack中出现了needle
            if (j == (needle.length() - 1)) {
                return (i - needle.length() + 1);
            }
        }
        return -1;
    }
}
