package com.dlq.hearthstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Deck {
    private final int cardsQuantity = 30;
    private final int dredgeSum = cardsQuantity * 3 - 3;
    public int dredgeCount = 0;
    public Deck pivot = null;
    HashMap<Integer, Integer> cards;
    
    public Deck() {
        this.cards = new HashMap<>();
        for (int i = 1; i <= cardsQuantity; i++) {
            cards.put(i, i);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck objectDeck = (Deck) o;
        
        boolean flag = true;
        for (int i = 1; i <= cardsQuantity; i++) {
            if (get(i) != objectDeck.get(i))
                flag = false;
        }
        return flag;
    }
    
    public void dredgeRandomly() {
        int randomNum = (int) (Math.random() * 3 + 1); // [1, 3]
        int chosenCardKey = cardsQuantity - randomNum + 1;
        //        System.out.println("chosenCardKey = " + chosenCardKey);
        dredge(chosenCardKey); // [28, 30]
    }
    
    // 一个朴素的通解，不一定最优：(设牌的编号为1-30)
    // 1.只要探底看到4-30就置于牌堆顶，直至底只剩321(的某个排列)，此时可以按顺序将牌堆顶整理为123，最坏情况下这一步探底了30次。
    // 2.现在牌堆顶3张已经整理好，此时再探底25次，把除了45以外的牌全部置于牌堆顶，25次后原先的3成为牌堆第28张，再探底5次依次把54321置于牌堆顶，这一步共探底30次。
    // 3.不断重复第2步，每次都能让牌堆顶已整理好的序列长度+2，直至整理好1-27。
    // 至此以上所有步骤最坏情况下探底13*30=390次。
    // 4.现在堆底3张必为28、29、30的某个排列，再探底3+27次把这三张的顺序整理好即可。
    // 故最坏情况下420次探底即可保证整理成功
    // -- RevueStarlight
    // https://bbs.nga.cn/read.php?&tid=31179798&pid=597769781&to=1
    
    public void dredgeLogically() {
        // 3.不断重复第2步，每次都能让牌堆顶已整理好的序列长度+2，直至整理好1-27。
        for (int i = 1; i < 27; ) {
            getFiveCardsOnTop(i);
            i += 2;
        }
        // 4.现在堆底3张必为28、29、30的某个排列，再探底3+27次把这三张的顺序整理好即可。
        get3CardsToBottom(1);
        sort3CardsToTop();
        System.out.println("dredgeCount: " + dredgeCount);
        
    }
    
    
    public void getFiveCardsOnTop(int card1) {
        get3CardsToBottom(card1);
        sort3CardsToTop();
        // 2.现在牌堆顶3张已经整理好，此时再探底25次，把除了45以外的牌全部置于牌堆顶，25次后原先的3成为牌堆第28张，再探底5次依次把54321置于牌堆顶，这一步共探底30次。
        get3CardsToBottom(card1 + 2);
        // 整理五张卡
        sort5CardsToTop();

        /* 整理 1~5 的情况
 1:  1    2:  2    3:  3    4:  4    5:  5    6: 27    7: 21    8:  9    9: 14   10:  8
11: 30   12: 28   13: 20   14: 22   15: 25   16: 13   17: 18   18: 11   19: 26   20: 15
21: 24   22: 10   23: 19   24: 12   25: 29   26:  6   27: 17   28: 16   29:  7   30: 23
// 1.只要探底看到4-30就置于牌堆顶，直至底只剩321(的某个排列)，此时可以按顺序将牌堆顶整理为123，最坏情况下这一步探底了30次。
        getThreeCards(1, 2, 3);
// 2.现在牌堆顶3张已经整理好，此时再探底25次，把除了45以外的牌全部置于牌堆顶，25次后原先的3成为牌堆第28张，再探底5次依次把54321置于牌堆顶，这一步共探底30次。
        for (int i = 0; i < 28; i++) {
            if (get(30) == 4 || get(30) == 5)
                if (get(29) == 4 || get(29) == 5)
                    dredge(28);
                else
                    dredge(29);
            else
                dredge(30);
        }
        // 整理五张卡
        for (int i = 0; i < 5; i++) {
            int max = 0;
            int maxKey = 0;
            for (int j = 26 + i; j <= 30; j++) {
                int value = get(j);
                if (value > max) {
                    max = value;
                    maxKey = j;
                }
            }
            dredge(maxKey);
        }
*/
    
    }
    
    public void get3CardsToBottom(int card1) {
        // 1.只要探底看到4-30就置于牌堆顶，直至底只剩321(的某个排列)，此时可以按顺序将牌堆顶整理为123，最坏情况下这一步探底了30次。
        // 如果 28~30 的卡不等于 1、2、3，则进行 for
        // for: { 如果 30 不在 1~3 之间，探底 30 直到 30 是 1~3 的一张
        //        如果 30 在 1~3 之间， 但 29 不在 1~3 之间，探底 29
        //        同理，探底 28 直到 28~30 都在 1~3 之间，满足 28~30 = 1+2+3，退出 for
        //        }
        boolean f30 = between(get(30), card1, card1 + 2);
        boolean f29 = between(get(29), card1, card1 + 2);
        boolean f28 = between(get(28), card1, card1 + 2);
        while (!(f30 && f29 && f28)) {
            if (!f30) dredge(30);
            else if (!f29) dredge(29);
            else if (!f28) dredge(28);
            f30 = between(get(30), card1, card1 + 2);
            f29 = between(get(29), card1, card1 + 2);
            f28 = between(get(28), card1, card1 + 2);
        }
        
    }
    
    private void sort3CardsToTop() {
        for (int i = 28; i <= 30; i++) {
            sort1CardsToTop(i);
        }
    }
    
    private void sort5CardsToTop() {
        sort1CardsToTop(28);
        sort1CardsToTop(28);
        sort1CardsToTop(28);
        sort1CardsToTop(29);
        sort1CardsToTop(30);
    }
    
    private void sort1CardsToTop(int i) {
        // 假设 cardNum = 3:
        // 从 28~30 检索最大值，把最大的探底到顶部，第二次的最大值从 29~30找
        // 假设 cardNum = 5:
        // 从 28~30 检索最大值，因为之前 getThreeCardsToBottom 会把最大的放在底下三张，所以一定能检索到五张中的最大的
        int max = 0;
        int maxKey = 0;
        for (int j = i; j >= 28 && j <= 30; j++) {
            int value = get(j);
            if (value > max) {
                max = value;
                maxKey = j;
            }
        }
        dredge(maxKey);
    }
    
    public void getOneCard(int card, int place) {
        while (get(place) != card) {
            dredge(place);
        }
    }
    
    public void getThreeCardsOneByOne(int card1, int card2, int card3) {
        getOneCard(card1, 30);
        getOneCard(card2, 29);
        getOneCard(card3, 28);
    }
    
    private boolean between(int index, int a, int b) {
        return index >= a && index <= b;
    }
    
    private int get(int index) {
        return this.cards.get(index);
    }
    
    private int bottom(int index) {
        return this.get(cardsQuantity - index + 1);
    }
    
    //    private HashMap<Integer,Integer> bottom5() {
    //        HashMap<Integer, Integer> bottom5 = new HashMap<>();
    //        for (int i = 25; i <= 30; i++) {
    //            bottom5.put(i, this.top(i));
    //        }
    //        return bottom5;
    //    }
    
    public void shuffle() {
        ArrayList<Integer> orderKeys = new ArrayList<>();
        for (int i = 0; i < cardsQuantity; i++) {
            orderKeys.add(i + 1);
        }
        Collections.shuffle(orderKeys);
        
        for (int i = 0; i < orderKeys.size(); i++) {
            cards.replace(i + 1, orderKeys.get(i));
        }
        this.dredgeCount = 0; // 重置探底次数
    }
    
    public void dredge(int card) {
        dredgeCount++;
        switch (card) {
            case 30:
                dredge30();
                return;
            case 29:
                dredge29();
                return;
            case 28:
                dredge28();
                return;
            default:
                return;
        }
    }
    
    private void dredge30() {
        int intoWalk = get(1); // 保存卡组顶部的牌
        cards.replace(1, get(30)); // 探底卡移到第一张，覆盖卡组顶部
        for (int i = 29; i > 1; i--) { // 其他卡牌向卡组底部移动
            cards.replace(i + 1, get(i));
        }
        cards.replace(2, intoWalk); // 将第一张牌移到第二张去
    }
    
    private void dredge29() {
        int intoWalk = get(1); // 保存卡组顶部的牌
        cards.replace(1, get(29)); // 探底卡移到第一张，覆盖卡组顶部
        for (int i = 28; i > 1; i--) { // 其他卡牌向卡组底部移动
            cards.replace(i + 1, get(i));
        }
        cards.replace(2, intoWalk); // 将第一张牌移到第二张去
    }
    
    private void dredge28() {
        int intoWalk = get(1); // 保存卡组顶部的牌
        cards.replace(1, get(28)); // 探底卡移到第一张，覆盖卡组顶部
        for (int i = 27; i > 1; i--) { // 其他卡牌向卡组底部移动
            cards.replace(i + 1, get(i));
        }
        cards.replace(2, intoWalk); // 将第一张牌移到第二张去
    }
    
    private void printAsciiHorizontally() {
        int count = 0;
        for (int i = 1; i <= cards.size(); i++) {
            System.out.printf("%2d: %2s   ", i, get(i));
            count++;
            int newLineThreshold = 10;
            if (count % newLineThreshold == 0 && i - cards.size() != 0)
                System.out.println();
        }
        System.out.println("\n-----------------------------------------------------------------------------------");
    }
    
    @Override
    public String toString() {
        printAsciiHorizontally();
        return "";
    }
    
    
    // 实现的非常不明不白
    //    @Override
    //    public void dredge(int cardKey) {
    //        if (cardKey < cardsQuantity - 2)
    //            return;
    //
    //        int intoWalk = get(1); // 保存卡组顶部的牌
    //        int movingCardValue = 0;
    //        movingCardValue = get(cardKey);
    //        cards.replace(1, movingCardValue); // 探底卡移到第一张，覆盖卡组顶部
    //
    //        for (int i = cardsQuantity; i > 1; i--) { // 其他卡牌向卡组底部移动
    //            movingCardValue = get(i);
    //            if (i != cardsQuantity) // 探底没选第三十张的话，第三十张不移动
    //                cards.replace(i + 1, movingCardValue);
    ////            System.out.print(i + " ");
    ////            System.out.println(get(i));
    //
    //        }
    //        cards.replace(2, intoWalk); // 卡组顶部的牌放在卡组第二张
    //        dredgeCount++;
    //    }
    
    
    // 不知道 entry 怎么用 key 拿出元素
    //    @Override
    //    public String toString() {
    //        StringBuilder sb = new StringBuilder();
    //        sb.append("[");
    //        for (Map.Entry<Integer, Integer> integer : cards.entrySet()) {
    //            sb.append(integer.getKey());
    //            sb.append(": ");
    //            sb.append(integer.getValue());
    //            sb.append(", ");
    //        }
    //        return sb.toString();
    //    }
    
    // iterator 会影响集合中元素的顺序
    //    private void printAsciiHorizontally() {
    //        int count = 0;
    //        Iterator<Integer> iterator = cards.keySet().iterator();
    //        for (int i = 1; iterator.hasNext(); i++) {
    //            System.out.printf("%3d: %s   ", i, iterator.next());
    //            count++;
    //            if (count % newLineThreshold == 0)
    //                System.out.println();
    //        }
    //        System.out.println();
    //        System.out.println("-----------------------------------------------------------------------------------");
    //    }
}


