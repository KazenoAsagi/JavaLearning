package com.dlq.hearthstone.Tests;

import com.dlq.hearthstone.Deck;

public class DredgeTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.pivot = new Deck();
        deck.shuffle();
        
        for (int i = 0; i < 50; i++) {
            deck.dredgeLogically();
            if (!deck.equals(deck.pivot)) {
                System.out.println("-------------------------------Not Equal:------------------------------------------\n");
                System.out.println(deck);
            } else {
                deck.shuffle();
            }
        }
        
        
        //        while (! deck.equals(deck.pivot)) {
        //            deck.dredgeRandomly();
        //        }
        
        //        int sum = 0;
        //        for (int i = 0; i < 20; i++) {
        //            deck.dredgeLogically();
        //            sum += deck.dredgeCount;
        //            deck.shuffle();
        //        }
        //        System.out.println(sum / 20);
        
        //        System.out.println(deck);
    }
}
