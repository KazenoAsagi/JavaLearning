package com.dlq.designPattern.prototype;

import com.dlq.designPattern.prototype.framework.Manager;
import com.dlq.designPattern.prototype.framework.Product;

/**
 * @author KznAsg
 * @version 2022/8/22  14:29
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        // 定义实际产品
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox warningBox = new MessageBox('*');
        MessageBox slashBox = new MessageBox('/');
        // 定义名称与实际产品的映射关系
        manager.register("strong message", underlinePen);
        manager.register("warning box", warningBox);
        manager.register("slash box", slashBox);
        
        // 根据注册名称创建实际产品
        Product product1 = manager.create("strong message");
        // 产品中可以指定你想要输出的字符串
        product1.use("Hello, World!");
        Product product2 = manager.create("warning box");
        product2.use("Hello, World!");
        Product product3 = manager.create("slash box");
        product3.use("Hello, World!");
        
    }
}
