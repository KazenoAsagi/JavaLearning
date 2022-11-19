package com.dlq.javaLearning.reflectionL;

/**
 * @author KznAsg
 * @version 2022/9/8  10:44
 * @page
 * @link
 */

public class ClassL {
    public static void main(String[] args) {
        try {
            Class<?> employeeClass = Class.forName("com.briup.base.javaCore.day12.Q1.Employee");
            System.out.println("employeeClass.getModule() = " + employeeClass.getModule());
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
