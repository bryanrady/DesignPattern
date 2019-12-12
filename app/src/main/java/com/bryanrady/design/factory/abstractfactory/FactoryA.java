package com.bryanrady.design.factory.abstractfactory;

/**
 * 现在A工厂只生产A类产品
 * Created by wangqingbin on 2019/1/2.
 */

public class FactoryA implements IAbstractFactory {

    @Override
    public IceBox createIceBox() {
        return new IceBoxA();
    }

    @Override
    public Washer createWasher() {
        return new WasherA();
    }
}
