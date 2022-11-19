package com.dlq.designPattern.factoryMethod;

import com.dlq.designPattern.factoryMethod.framework.Factory;
import com.dlq.designPattern.factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KznAsg
 * @version 2022/8/29  12:11
 */
public class IDCardFactory extends Factory {
    private final List<String> ownerList = new ArrayList<>();
    
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    
    @Override
    protected void registerProduct(Product product) {
        ownerList.add(((IDCard) product).getOwner());
    }
    
    public List<String> getOwnerList() {
        return ownerList;
    }
}
