package com.bryanrady.design.bridge;

/**
 * Created by Administrator on 2019/1/3.
 */

public class Bus extends AbstractCar {

    @Override
    public void run() {
        System.out.print("公交车 ");
    }

}
