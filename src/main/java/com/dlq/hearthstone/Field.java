package com.dlq.hearthstone;

import java.util.ArrayList;

public class Field {
    public ArrayList<Minion> minions;
    
    public Field(ArrayList<Minion> minions) {
        this.minions = minions;
    }
    
    public void newMinionIntoField(Minion m) {
        minions.add(m);
    }
    
    public void checkEveryMinionIfDies() {
        for (int i = 0; i < minions.size(); i++) {
            checkMinionIfDies(minions.get(i));
        }
    }
    
    private void checkMinionIfDies(Minion m) {
        if (m.getHealth() <= 0)
            minions.remove(m);
    }
    
    @Deprecated
    public void mineField() {
        int totalDamage = 5;
        for (int i = 0; i < totalDamage; i++) {
            Minion minion = minions.get((int) (Math.random() * minions.size()));
            minion.getDamaged(1);
            checkEveryMinionIfDies();
        }
    }
    
    public boolean contains(Minion m) {
        for (Minion minion : minions) {
            if (minion.getName() == m.getName())
                return true;
        }
        return false;
    }
    
}
