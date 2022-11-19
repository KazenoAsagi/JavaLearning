package com.ydlclass.designPatterns.factories.abstractFactory;

public class MiFactory extends AbstractFactory {
    @Override
    AbstractPhone productPhone() {
        return new Mi14();
    }
    
    @Override
    AbstractPC productPC() {
        return new Mibook();
    }
}
