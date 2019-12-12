package com.bryanrady.design.bridge;

/**
 * Created by Administrator on 2019/1/3.
 */

public class Car extends AbstractCar {

    @Override
    public void run() {
        System.out.print("小汽车 ");
    }
}
