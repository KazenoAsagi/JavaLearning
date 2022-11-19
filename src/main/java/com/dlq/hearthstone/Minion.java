package com.dlq.hearthstone;

public class Minion implements Cloneable {
    private final String name;
    private int attack;
    private int healthMaximum;
    private int health;
    
    public Minion(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        healthMaximum = health;
        this.health = healthMaximum;
    }
    
    public void getDamaged(int damage) {
        this.health -= damage;
    }
    
    @Override
    public String toString() {
        return name +
                     "{" +
                     "attack=" + attack +
                     ", health=" + health +
                     "/" + healthMaximum +
                     '}';
    }
    
    @Override
    public Minion clone() {
        try {
            Minion clone = (Minion) super.clone();
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getHealthMaximum() {
        return healthMaximum;
    }
    
    public void setHealthMaximum(int healthMaximum) {
        if (health < healthMaximum)
            health = healthMaximum;
        this.healthMaximum = healthMaximum;
    }
    
    public int getHealth() {
        return health;
    }
}
