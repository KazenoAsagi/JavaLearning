package com.dlq.designPattern.memento.game;

import java.util.ArrayList;
import java.util.List;

import static com.dlq.designPattern.memento.game.Gamer.Fruit;

/**
 * @author KznAsg
 * @version 2022/11/19  下午 9:23
 * @描述 玩家的存档, 支持存档和读档
 * @页码 210
 * @链接
 */

public class Memento {
    protected int money;
    protected List<Fruit> fruitList;
    protected int currentTurn;
    
    protected int getCurrentTurn() {
        return currentTurn;
    }
    
    /**
     * 面向内部的构造器
     *
     * @param money 玩家初始持有的金钱
     */
    protected Memento(int money, int currentTurn) {
        this.money = money;
        this.fruitList = new ArrayList<>(Fruit.values().length);
        this.currentTurn = currentTurn;
    }
    
    /**
     * 面向内部的接口
     *
     * @param fruit 添加到玩家物品栏中的水果
     */
    protected void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }
    
    /**
     * 面向内部的接口
     *
     * @return 玩家持有的水果
     */
    protected List<Fruit> getFruitList() {
        return fruitList;
    }
    
    /**
     * 面向外部的接口
     *
     * @return 玩家当前有多少钱
     */
    protected int getMoney() {
        return money;
    }
    
    @Override
    public String toString() {
        return new StringBuilder()
                     .append("存档里有这么多钱: ")
                     .append(getMoney())
                     .append("有这些水果: ")
                     .append(getFruitList().toString())
                     .append("当前回合是：")
                     .append(getCurrentTurn())
                     .toString();
        
    }
}
