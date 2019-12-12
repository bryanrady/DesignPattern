package com.bryanrady.design.factory.factorymethod;

/**
 * Created by Administrator on 2019/1/2.
 */

public class IceBoxProduct implements Product {

    public IceBoxProduct() {
        System.out.println("冰箱 已经生产出来了!");
    }

    @Override
    public String getProductMode() {
        return "冰箱型号 22";
    }
}
