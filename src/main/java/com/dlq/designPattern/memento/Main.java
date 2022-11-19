package com.dlq.designPattern.memento;

import com.dlq.designPattern.memento.game.Gamer;

/**
 * @author KznAsg
 * @version 2022/11/19  下午 9:59
 * @描述 进行一场游戏, 玩家可以掷骰子来赢钱, 还可以存档读档
 * @页码 212
 * @链接
 */

public class Main {
    private static final int GOOD_STATE_MONEY = 100;
    private static final int BAD_STATE_MONEY = 70;
    private static final int GAME_TURN = 20;
    
    public static void main(String[] args) throws InterruptedException {
        Gamer gamer = new Gamer(100);
        gamer.saveMeNow();
        
        
        for (int i = 0; i < GAME_TURN; i++) {
            System.out.println("游戏回合: " + i);
            
            gamer.bet();
            
            System.out.println("玩家目前状态: " + gamer);
            
            if (gamer.getMoney() >
                      gamer.getMoneyWhenSaved() + GOOD_STATE_MONEY) {
                System.out.printf("比之前存档多了 %d 元, 玩家决定存个档\n", GOOD_STATE_MONEY);
                gamer.saveMeNow();
            }
            if (gamer.getMoney() <
                      gamer.getMoneyWhenSaved() - BAD_STATE_MONEY) {
                System.out.printf("比之前存档足足少了 %d 元, 玩家要读档了\n", BAD_STATE_MONEY);
                gamer.loadMeNow();
                
            }
            
            
            System.out.println();
            
        }
        
        Thread.sleep(2000);
        
    }
}
