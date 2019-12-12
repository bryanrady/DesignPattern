package com.bryanrady.design.factory.abstractfactory;

/**
 * B工厂只生产B类产品
 * Created by wangqingbin on 2019/1/2.
 */

public class FactoryB implements IAbstractFactory {

    @Override
    public IceBox createIceBox() {
        return new IceBoxB();
    }

    @Override
    public Washer createWasher() {
        return new WasherB();
    }
}
