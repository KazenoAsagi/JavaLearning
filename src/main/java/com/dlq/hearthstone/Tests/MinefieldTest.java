package com.dlq.hearthstone.Tests;

import com.dlq.hearthstone.Cards.MineField;
import com.dlq.hearthstone.Minion;
import com.dlq.hearthstone.ProbabilityAfterUseCard;

/*
 * 暗牧场上：穴居人(1/1/2) + 大一新生(1/1/4)，一共6血
 * 防战使用一张雷区挑战（全场随从分配(5)点伤害）
 * 问穴居人被解的概率。
 * */

public class MinefieldTest {
    public static void main(String[] args) {
        //        第一个实现：手写代码，没有封装
        //        final int loopTurns = 1;
        //        int irondeepTroggDies = 0;
        //        int frazzledFreshmanDies = 0;
        //        for (int i = 0; i < loopTurns; i++) {
        //            Field field = new Field(new ArrayList<Minion>());
        //            field.newMinionIntoField(new Minion("irondeepTrogg", 1, 2));
        //            field.newMinionIntoField(new Minion("frazzledFreshman", 1, 4));
        //            field.mineField();
        //            System.out.print(i + ": ");
        //            System.out.println(field.minions);
        //
        //            if (field.minions.get(0).getName() == "irondeepTrogg") frazzledFreshmanDies++;
        //            else irondeepTroggDies++;
        //        }
        //        System.out.println("irondeepTroggDies: " + irondeepTroggDies);
        //        System.out.println("frazzledFreshmanDies: " + frazzledFreshmanDies);
        
        
        Minion irondeepTrogg = new Minion("irondeepTrogg", 1, 2);
        Minion frazzledFreshman = new Minion("frazzledFreshman", 1, 4);
        ProbabilityAfterUseCard probabilityAfterUseCard = new ProbabilityAfterUseCard(10000000);
        System.out.println(probabilityAfterUseCard.getDeathCounts(new MineField(), irondeepTrogg, frazzledFreshman));
    }
}
