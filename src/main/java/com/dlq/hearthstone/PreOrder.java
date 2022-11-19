package com.dlq.hearthstone;

public class PreOrder {
    // private int sum = -1;
    // int[] dp = null;
    //
    // public PreOrder(int sum) {
    //     this.sum = sum;
    // }
    //
    // enum Coins {
    //     a, b, c, d, e, f;
    //
    //     public int getMoneyLevel() {
    //         return switch (this.name()) {
    //             case "a" -> 30;
    //             case "b" -> 60;
    //             case "c" -> 128;
    //             case "d" -> 328;
    //             case "e" -> 388;
    //             case "f" -> 488;
    //             default -> -1;
    //         };
    //     }
    // }
    //
    // public int coins(int i) {
    //     return switch (i) {
    //         case 1 -> Coins.a.getMoneyLevel();
    //         case 2 -> Coins.b.getMoneyLevel();
    //         case 3 -> Coins.c.getMoneyLevel();
    //         case 4 -> Coins.d.getMoneyLevel();
    //         case 5 -> Coins.e.getMoneyLevel();
    //         case 6 -> Coins.f.getMoneyLevel();
    //         default -> -1;
    //     };
    // }
    //
    //
    // // 零钱兑换：完全背包问题
    // // dp[j] = dp[j - coins[i]]
    // // dp[0]
    //
    // public void reachSum() {
    //     dp = new int[sum + 1];
    //     dp[0] = 1;
    //     for (int i = 0; i < Coins.values().length; i++) { // 遍历充值档位
    //         for (int j = coins(i); j <= sum; j++) {
    //             dp[j] += dp[j - coins(i)];
    //         }
    //     }
    //
    // }
    //
    // public static void main(String[] args) {
    //     PreOrder preOrder = new PreOrder(500);
    //     preOrder.reachSum();
    // }
}
