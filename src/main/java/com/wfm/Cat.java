package com.wfm;

/**
 * @author KznAsg
 * @version 2022/9/9  23:13
 * @page
 * @link
 */

public class Cat extends AbstractAnimal {
    
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    
    @Override
    public void eat(int year) {
    
    }
    
    @Override
    public String die(int year) {
        return null;
    }
    
    @Override
    public int getAge() {
        return 0;
    }
}
