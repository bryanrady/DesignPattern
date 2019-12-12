package com.bryanrady.design.factory.simplefactory;

/**
 * android产品通过AndroidProductFactory工厂来制造
 * Created by wangqingbin on 2019/1/2.
 */

public class AndroidProductFactory implements IProduct {

    @Override
    public void makeProduct() {
        System.out.println("android 产品被制造出来了!");
    }
}
