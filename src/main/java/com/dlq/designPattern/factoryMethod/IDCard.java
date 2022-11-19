package com.dlq.designPattern.factoryMethod;

import com.dlq.designPattern.factoryMethod.framework.Product;

/**
 * @author KznAsg
 * @version 2022/8/29  12:06
 */
public class IDCard extends Product {
    private final String owner;
    
    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }
    
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
    
    public String getOwner() {
        return owner;
    }
}
