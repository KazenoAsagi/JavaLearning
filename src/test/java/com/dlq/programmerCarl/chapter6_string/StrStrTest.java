package com.dlq.programmerCarl.chapter6_string;

import org.junit.Test;

public class StrStrTest {
    @Test
    public void strStrTest() {
        String s1 = "abfabcab";
        String s2 = "abcab";
        int i = new StrStr().strStr(s1, s2);
        System.out.println(i);
    }
}