package com.ydlclass.designPatterns.factories.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new HuaweiFactory();
        AbstractPC product = factory.productPC();
        System.out.println(product);
    }
}
