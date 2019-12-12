package com.bryanrady.design.factory.factorymethod;

/**
 * Created by Administrator on 2019/1/2.
 */

public class WasherProduct implements Product {

    public WasherProduct() {
        System.out.println("洗衣产品 已经生产出来了!");
    }

    @Override
    public String getProductMode() {
        return "洗衣 型号 11";
    }
}
