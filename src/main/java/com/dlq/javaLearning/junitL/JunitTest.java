package com.dlq.javaLearning.junitL;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {
    
    @Test
    public void testOne() {
        System.out.println("123");
    }
    
    @Test
    public void testTwo() {
        int i = 1 / 0;
    }
    
    @Test
    public void junitAssert() {
        int i = 5;
        i += 1;
        Assert.assertEquals(6, i);
    }
    
    @Test
    public void junitAssertFalse() {
        int i = 5;
        Assert.assertEquals(6, i);
    }
    
    @Test
    public void javaAssert() {
        Object o = null;
        // 这是什么特性……？
        assert o != null;
        String string = o.toString();
    }
    
}
