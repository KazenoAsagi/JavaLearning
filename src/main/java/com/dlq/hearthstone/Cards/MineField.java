package com.dlq.hearthstone.Cards;

import com.dlq.hearthstone.Field;
import com.dlq.hearthstone.Minion;

public class MineField implements Card {
    private final int totalDamage = 5;
    
    @Override
    public void use(Field field) {
        for (int i = 0; i < totalDamage; i++) {
            Minion minion = field.minions.get((int) (Math.random() * field.minions.size()));
            minion.getDamaged(1);
            field.checkEveryMinionIfDies();
        }
    }
}
