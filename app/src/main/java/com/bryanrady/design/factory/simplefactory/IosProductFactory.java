package com.bryanrady.design.factory.simplefactory;

/**
 * ios产品通过IosProductFactory这个工厂来制造
 * Created by wangqingbin on 2019/1/2.
 */

public class IosProductFactory implements IProduct {

    @Override
    public void makeProduct() {
        System.out.println("ios 产品被制造出来了!");
    }
}
