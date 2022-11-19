package com.dlq.javaLearning.reflectionL;

import java.util.Arrays;
import java.util.Date;

public class ClassReflection {
    public static void main(String[] args) {
        try {
            Class<?> cl = Class.forName("com.briup.base.javaCore.day12.Q1.Floater");
            System.out.println("\nFull Name: --------");
            System.out.println(cl.getName());
            System.out.println("Class Name: --------");
            System.out.println(cl.getSimpleName());
            
            System.out.println("\nPublic Fields(Variable): --------");
            System.out.println(Arrays.toString(cl.getFields()));
            System.out.println("Fields(Variable): --------");
            System.out.println(Arrays.toString(cl.getDeclaredFields()));
            
            System.out.println("\nMethods: --------");
            System.out.println(Arrays.toString(cl.getDeclaredMethods()));
            System.out.println("Constructors: --------");
            System.out.println(Arrays.toString(cl.getConstructors()));
            System.out.println(Arrays.toString(cl.getDeclaredConstructors()));
            
            System.out.println("\nGet Methods with parameters: --------");
            System.out.println(cl.getDeclaredMethod("setWorkHours", double.class));
            System.out.println("Get Constructors with parameters: --------");
            System.out.println(cl.getDeclaredConstructor(String.class, String.class, Date.class, double.class, double.class));
            
            System.out.println("\nIf Not Found: --------");
            System.out.println(cl.getDeclaredConstructor(String.class));
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        
    }
}
