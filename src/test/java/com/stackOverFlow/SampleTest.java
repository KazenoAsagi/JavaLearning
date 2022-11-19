package com.stackOverFlow;

import org.junit.jupiter.api.Test;

/**
 * @author KznAsg
 * @version 2022/10/25  上午 10:41
 * @description junit调试1
 * @page
 * @link https://stackoverflow.com/questions/73484892/nosuchfieldexpression-when-debbugging
 */

public class SampleTest {
    @Test
    public void someTest() {
        //Arrange
        var a = 5;
        var b = 10;
        //Act
        var res = a + b;
        //Assert
        System.out.println(res);
        
    }
    
}
