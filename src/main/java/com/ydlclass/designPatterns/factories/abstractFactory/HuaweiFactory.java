package com.ydlclass.designPatterns.factories.abstractFactory;

public class HuaweiFactory extends AbstractFactory {
    @Override
    AbstractPhone productPhone() {
        return new Mate50();
    }
    
    @Override
    AbstractPC productPC() {
        return new Matebook16();
    }
}
