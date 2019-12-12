package com.bryanrady.design.factory.factorymethod;

/**
 * Created by Administrator on 2019/1/2.
 */

public class WasherFactory implements IFactory {

    @Override
    public Product createProduct() {
        return new WasherProduct();
    }
}
