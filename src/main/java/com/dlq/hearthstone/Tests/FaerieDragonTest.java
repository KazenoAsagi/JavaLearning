package com.dlq.hearthstone.Tests;

import com.dlq.hearthstone.Cards.ArcaneMissiles;
import com.dlq.hearthstone.Minion;
import com.dlq.hearthstone.ProbabilityAfterUseCard;

public class FaerieDragonTest {
    public static void main(String[] args) {
        Minion faerieDragon = new Minion("FaerieDragon", 3, 2);
        Minion opponentHero = new Minion("opponentHero", 0, 30);
        ProbabilityAfterUseCard probabilityAfterUseCard = new ProbabilityAfterUseCard(1000000);
        System.out.println(probabilityAfterUseCard.getDeathCounts
                                                        (new ArcaneMissiles(), faerieDragon, opponentHero));
    }
}
