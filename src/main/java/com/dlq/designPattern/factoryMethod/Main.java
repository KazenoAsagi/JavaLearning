package com.dlq.designPattern.factoryMethod;

import com.dlq.designPattern.factoryMethod.framework.Factory;
import com.dlq.designPattern.factoryMethod.framework.Product;

/**
 * @author KznAsg
 * @version 2022/8/29  12:19
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        
        card1.use();
        card2.use();
        card3.use();
        
    }
}
