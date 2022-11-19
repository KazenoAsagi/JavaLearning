package com.dlq.designPattern.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author KznAsg
 * @version 2022/11/19  下午 9:08
 * @描述 玩家类, 可以使用 Memento 进行存档和读档
 * @页码 211
 * @链接
 */

public class Gamer {
    private final Random random = new Random();
    private Memento memento;
    private int money;
    private List<Fruit> fruitList = new ArrayList<>();
    
    public Gamer(int money) {
        this.money = money;
        this.memento = new Memento(money);
    }
    
    @Override
    public String toString() {
        return new StringBuilder()
                     .append("金币: ")
                     .append(money)
                     .append(", 持有水果: ")
                     .append(fruitList)
                     .toString();
    }
    
    /**
     * 玩家进行存档
     * 但只能保存好吃的水果, 其他水果会被丢弃
     */
    public void saveMeNow() {
        Memento newSave = new Memento(getMoney());
        for (Fruit fruit : fruitList) {
            if (fruit.isJuicy) {
                newSave.addFruit(fruit);
            } else {
                System.out.println("丢弃了普通的 [" + fruit.name() + "]");
            }
        }
        this.memento = newSave;
        System.out.println("存档成功! ");
    }
    
    /**
     * 玩家进行读档
     */
    public void loadMeNow() {
        this.money = memento.getMoney();
        this.fruitList = memento.fruitList;
    }
    
    public int getMoney() {
        return money;
    }
    
    public int getMoneyWhenSaved() {
        return memento.getMoney();
    }
    
    /**
     * 进行一轮游戏
     */
    public void bet() {
        int dice = random.nextInt(6) + 1;
        System.out.println("骰子掷出了" + dice);
        switch (dice) {
            case 1 -> money += 70;
            case 2 -> money -= 40;
            case 3 -> money -= 60;
            case 4 -> money += 30;
            case 5 -> money -= 300;
            
            case 6 -> {
                Fruit randomFruit = getRandomFruit();
                fruitList.add(randomFruit);
            }
            
            // case 1:
            //     money += 100;
            //     break;
            // case  2:
            //     money /= 2;
            //     break;
            // case 6:
            //     System.out.println("获得了水果" + getFruit());
            //     break;
        }
        checkMoney();
    }
    
    private void checkMoney() {
        if (money < 0) {
            System.out.println("玩家的钱还剩:" + money);
            System.out.println("玩家发现没钱了捏, 读档读档");
            loadMeNow();
        }
    }
    
    private Fruit getRandomFruit() {
        int randomInt = random.nextInt(Fruit.values().length);
        Fruit randomFruit = Fruit.values()[randomInt];
        
        if (random.nextBoolean()) {
            randomFruit.isJuicy = true;
        }
        System.out.println("*获得了水果* " + randomFruit);
        
        return randomFruit;
    }
    
    protected enum Fruit {
        苹果, 香蕉, 葡萄, 橘子;
        
        /**
         * 水果是否好吃
         */
        private boolean isJuicy = false;
        
        @Override
        public String toString() {
            String s = isJuicy ? "好吃的" : "";
            return s + this.name();
        }
    }
    
}
