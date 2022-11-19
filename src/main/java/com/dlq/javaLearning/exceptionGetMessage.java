package com.dlq.javaLearning;

public class exceptionGetMessage {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
