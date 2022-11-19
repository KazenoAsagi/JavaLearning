package com.dlq.javaLearning;

/**
 * @author KazenoAsagi
 * @version 2022/8/12  16:49
 */
public class LongToIntHowMuch {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        System.out.println("a = " + a);
        int b = (int) a;
        System.out.println("b = " + b);
        System.out.println(-1 % 5);
        System.out.println(88888888 % 5);
        
        long eightDigit = 88888888;
        int c1 = (int) eightDigit;
        System.out.println("c1 = " + c1);
        
        long elevenDigit = 12345678901L;
        int c2 = (int) elevenDigit;
        System.out.println("c2 = " + c2);
        int moded = c2 % 5;
        System.out.println("moded = " + moded);
        switch (-2) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            
            default:
                System.out.println("the int is negative.");
                break;
        }
    }
}
