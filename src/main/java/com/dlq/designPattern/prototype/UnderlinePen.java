package com.dlq.designPattern.prototype;

import com.dlq.designPattern.prototype.framework.Product;

/**
 * @author KznAsg
 * @version 2022/8/22  14:24
 */
public class UnderlinePen implements Product {
    private char ulchar;
    
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }
    
    @Override
    public void use(String s) {
        int length = s.length();
        System.out.println("\"" + s + "\"");
        // 对齐~上方的引号
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
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
