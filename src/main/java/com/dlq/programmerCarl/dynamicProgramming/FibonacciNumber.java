package com.dlq.programmerCarl.dynamicProgramming;

import java.util.ArrayList;

public class FibonacciNumber {
    // https://leetcode-cn.com/problems/fibonacci-number/
    
    // 动规五部曲：
    // 这⾥我们要⽤⼀个⼀维dp数组来保存递归的结果
    // 1. 确定dp数组以及下标的含义
    // dp[i]的定义为：第i个数的斐波那契数值是dp[i]
    // 2. 确定递推公式
    // 为什么这是⼀道⾮常简单的⼊⻔题⽬呢？
    // 因为题⽬已经把递推公式直接给我们了：状态转移⽅程 dp[i] = dp[i - 1] + dp[i - 2];
    // 3. dp数组如何初始化
    // 题⽬中把如何初始化也直接给我们了，如下：
    // 4. 确定遍历顺序
    // 从递归公式dp[i] = dp[i - 1] + dp[i - 2];中可以看出，dp[i]是依赖 dp[i - 1] 和 dp[i - 2]，那么遍历的顺序
    // ⼀定是从前到后遍历的
    // 5. 举例推导dp数组
    // 按照这个递推公式dp[i] = dp[i - 1] + dp[i - 2]，我们来推导⼀下，当N为10的时候，dp数组应该是如下的
    // 数列：
    // 0 1 1 2 3 5 8 13 21 34 55
    // 如果代码写出来，发现结果不对，就把dp数组打印出来看看和我们推导的数列是不是⼀致的。
    
    // list 的问题在于，如果不添加元素，就无法用 set 去设置它的值，所以需要初始化
    // 如果初始化的不合理，set 就会越界
    // 而数组是不用初始化的，只要在一开始设定的大小范围内，就可以随意改动数组的元素
    
    public static int fib1(int N) {
        if (N <= 1) {
            return N;
        }
        ArrayList<Integer> dp = new ArrayList<>();
        // ArrayList 需要添加元素来初始化
        for (int i = 0; i < N + 1; i++) {
            dp.add(0);
        }
        
        dp.set(0, 0);
        dp.set(1, 1);
        for (int i = 2; i <= N; i++) {
            int dpi = dp.get(i - 1) + dp.get(i - 2);
            dp.set(i, dpi);
        }
        return dp.get(N);
    }
    
    // 用数组的方案，看起来更简洁，效率也更高
    public static int fib2(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        System.out.println("fib1(3) = " + fib1(3));
        System.out.println("fib1(60) = " + fib1(60));
        System.out.println("fib2(3) = " + fib2(3));
        System.out.println("fib2(60) = " + fib2(60));
    }
}

