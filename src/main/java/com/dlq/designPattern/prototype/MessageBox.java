package com.dlq.designPattern.prototype;

import com.dlq.designPattern.prototype.framework.Product;

/**
 * @author KznAsg
 * @version 2022/8/22  14:03
 */
public class MessageBox implements Product {
    // decorationChar
    private final char decoChar;
    
    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }
    
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
    }
    
    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
    
}
