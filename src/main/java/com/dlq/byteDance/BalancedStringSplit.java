package com.dlq.byteDance;

/*
 * 描述
 * 在一个均衡字符串中，'L' 和 'R' 字符的数量是相同的。
 * 给你一个均衡字符串 s，请你将它分割成尽可能多的均衡字符串。
 * ps：分割得到的每个字符串都必须是均衡字符串，且分割得到的均衡字符串是原均衡字符串的连续子串。
 * 返回可以通过分割得到的均衡字符串的最大数量 。
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s[i] = 'L' 或 'R'
 * s是一个均衡字符串
 *
 * 输入
 * s = "RLRRLLRLRL"
 * 输出
 * 4
 *  */

import org.junit.Test;

public class BalancedStringSplit {
    
    
    public int balancedStringSplit(String s) {
        int returnNum = 0;
        char[] chars = s.toCharArray();
        int sumR = 0;
        int sumL = 0;
        for (char aChar : chars) {
            if (aChar == 'R') {
                sumR++;
            } else if (aChar == 'L') {
                sumL++;
            }
            if (sumL == sumR) {
                returnNum++;
                sumR = 0;
                sumL = 0;
            }
        }
        return returnNum;
    }
    
    @Test
    public void balancedStringSplitTest() {
        System.out.println("balancedStringSplit(\"RLRLRLRLRLRLRLRLRL\") = " + balancedStringSplit("RLRLRLRLRLRLRLRLRL"));
        //    balancedStringSplit("RL")
        System.out.println("balancedStringSplit(\"RRRLLL\") = " + balancedStringSplit("RRRLLL"));
        System.out.println("balancedStringSplit(\"RLLRLR\") = " + balancedStringSplit("RLLRLR"));
    }
}
