package com.dlq.programmerCarl.chapter6_string;

/**
 * @author KznAsg
 * @version 2022/9/10  23:41
 * @page
 * @link
 */

public class StrStr {
    /*
     * 名词解释：
     * needle=模式串：一个小字符串，我们需要在主串里面找到的东西
     * haystack=主串：一个大字符串，我们要在这里面找到其中有没有模式串
     * 两个指针：
     * i是在字符串右边寻找相同字符串的指针，指向后缀的末尾
     * j是在字符串左边寻找相同字符串的指针，指向前缀的末尾
     * 不妨设想，i和j在模式串里寻找相同前后缀，找到前后有ABC是相同的串，但第四个字符不相同，
     * 这时候因为已经不相同了，j会从前缀表里看，之前有没有什么数据可以帮我省时间(代码：j = next[j];)
     
     *  */
    
    public void getNext(int[] next, String needle) {
        // 初始化next数组
        // i指向后缀末尾位置，j指向前缀末尾位置
        int i = 1;
        int j = -1;
        next[0] = j;
        // next[i]表示在i之前 最长相等的前后缀的长度(也就是j)
        for (; i < needle.length(); i++) {
            // 如果发现模式串和主串
            while (j >= 0 && needle.charAt(i) != needle.charAt(j + 1)) {
                // 向前回退到next[j]的位置
                j = next[j];
            }
            if (needle.charAt(i) == needle.charAt(j + 1)) {
                j++;
            }
            // 将前缀的长度赋值给next数组
            next[i] = j;
        }
    }
    
    public int strStr(String haystack, String needle) {
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) {
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j + 1)) {
                j++;
            }
            if (j == (next.length - 1)) {
                return (i - needle.length() + 1);
            }
        }
        return -1;
    }
    
    
}
