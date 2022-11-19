package com.wfm;

/**
 * @author KznAsg
 * @version 2022/9/9  23:14
 * @page
 * @link
 */

public class Dog implements Animal {
    
    public static void main(String[] args) {
        new Dog().die(13);
        Dog aa = new Dog();
        aa.die(13);
        
        aa.die(Season.Spring.ordinal());
    }
    
    @Override
    public void eat() {
        return;
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
