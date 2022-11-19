package com.dlq.programmerCarl.chapter3;

import org.junit.Test;

import java.util.Arrays;

// P45 螺旋矩阵
public class generateMatrix {
    private int[][] doGenerate(int input) {
        int[][] res = new int[input][input];
        int startX = 0, startY = 0; // 定义矩阵的每个圈的起始位置
        int loop = input / 2;           // 每个圈循环几次：input=3, 则只循环一圈
        int mid = input / 2;            // 矩阵中心位置，例如 input=3, 则中心就是 (1,1)
        int count = 1;              // 给矩阵填空的数字
        int offset = 1;             // 每一圈循环中，控制每一条边的变量
        int i, j;
        while (loop-- > 0) {
            i = startX;
            j = startY;
            
            // 以下循环皆保持左闭右开的原则
            // 从左到右填充上行
            for (j = startY; j < startY + input - offset; j++) {
                res[startX][j] = count;
                count++;
            }
            // 从上到下填充右列，这里继承了上次循环的 j 的大小
            for (i = startX; i < startX + input - offset; i++) {
                res[i][j] = count;
                count++;
            }
            // 从右到左填充下行，继承了上次 i 的大小
            for (; j > startY; j--) {
                res[i][j] = count;
                count++;
            }
            // 从下到上填充左列，继承了上次 j 的大小
            for (; i > startX; i--) {
                res[i][j] = count;
                count++;
            }
            // 第二圈的位置在第一圈的基础上向右、向下各走一格
            startX++;
            startY++;
            // 每一条边遍历的长度 -2
            offset += 2;
        }
        // 如果 input 为奇数，单独给最中央的格子赋值
        if (input % 2 == 1) {
            res[mid][mid] = count;
        }
        return res;
    }
    
    @Test
    public void doGenerateTest() {
        int n = 3;
        System.out.println("doGenerate(n) = " + Arrays.deepToString(doGenerate(n)));
    }
}
