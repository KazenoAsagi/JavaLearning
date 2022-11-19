package com.dlq.designPattern.prototype.framework;

import java.util.HashMap;

/**
 * @author KznAsg
 * @version 2022/8/22  13:58
 */
public class Manager {
    private final HashMap<String, Product> showcase = new HashMap<>();
    
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }
    
    public Product create(String prototypeName) {
        Product product = showcase.get(prototypeName);
        return product.createClone();
    }
}
