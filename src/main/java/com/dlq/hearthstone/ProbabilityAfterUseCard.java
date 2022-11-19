package com.dlq.hearthstone;

import com.dlq.hearthstone.Cards.Card;

import java.util.ArrayList;

public class ProbabilityAfterUseCard {
    private int loopTurns = 10000;
    
    public ProbabilityAfterUseCard(int loopTurns) {
        this.loopTurns = loopTurns;
    }
    
    public ArrayList<Integer> getDeathCounts(Card card, Minion... originalMinions) {
        ArrayList<Integer> deathCounts = new ArrayList<>();
        for (int i = 0; i < originalMinions.length; i++) {
            deathCounts.add(0);
        }
        
        for (int i = 0; i < loopTurns; i++) {
            Field field = new Field(new ArrayList<Minion>());
            for (Minion minion : originalMinions) {
                field.newMinionIntoField(minion.clone());
            }
            card.use(field);
            System.out.print(i + ": ");
            System.out.println(field.minions);
            
            for (int j = 0; j < originalMinions.length; j++) {
                if (!field.contains(originalMinions[j])) {
                    int count = deathCounts.get(j);
                    count++;
                    deathCounts.set(j, count);
                }
            }
        }
        return deathCounts;
    }
}
