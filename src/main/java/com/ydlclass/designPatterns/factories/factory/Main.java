package com.ydlclass.designPatterns.factories.factory;

public class Main {
    public static void main(String[] args) {
        Factory mate50Factory = new Mate50Factory();
        HuaweiPhone product = mate50Factory.product();
        product.call();
    }
}
