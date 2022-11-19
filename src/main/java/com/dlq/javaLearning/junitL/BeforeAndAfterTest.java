package com.dlq.javaLearning.junitL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterTest {
    int i, j;
    
    @Before
    public void var1() {
        i = 1;
    }
    
    @Before
    public void var2() {
        j = 2;
    }
    
    @Test
    public void print1() {
        System.out.println(i);
        System.out.println(j);
    }
    
    @After
    public void done() {
        System.out.println("done");
    }
}
