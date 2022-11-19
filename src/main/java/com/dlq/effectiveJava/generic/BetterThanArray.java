package com.dlq.effectiveJava.generic;

/**
 * @author KznAsg
 * @version 2022/9/6  22:41
 * @page 108
 */
public class BetterThanArray {
    public void ifAddStringForArrayOfLong() {
        Object[] objectArray = new Long[10];
        objectArray[0] = "some string";
        // 抛出异常：ArrayStoreException
        /* 意思是我们不能把string放到long数组里，
           但在编译的时候编译器会觉得string放到Object数组里是合理的
        */
    }
    
    public void ifAddStringForListOfLong() {
        // 本行直接报错了，不能把long泛型的赋给object泛型！编译期直接报错，非常有利于检查错误。
        // List<Object> objectList = new ArrayList<Long>();
        // objectList.add("some string");
    }
}
