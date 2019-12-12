package com.bryanrady.design.factory.abstractfactory;

/**
 * 工厂既生产冰箱 又生产洗衣产品
 * Created by wanqgingbin on 2019/1/2.
 */

public interface IAbstractFactory {

    IceBox createIceBox();

    Washer createWasher();

}
