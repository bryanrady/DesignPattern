package com.bryanrady.design.factory.simplefactory;

/**
 * php产品通过IPhpProductFactory这个工厂来制造
 * Created by wangqingbin on 2019/1/2.
 */

public class PhpProductFactory implements IProduct {

    @Override
    public void makeProduct() {
        System.out.println("php 产品被制造出来了!");
    }
}
