package com.dlq.designPattern.factoryMethod.framework;

/**
 * @author KznAsg
 * @version 2022/8/29  12:06
 */
public abstract class Factory {
    protected abstract Product createProduct(String owner);
    
    protected abstract void registerProduct(Product product);
    
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
