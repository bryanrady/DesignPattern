package com.bryanrady.design.bridge;

/**
 * Created by Administrator on 2019/1/3.
 */

public class StreetWay extends AbstractRoad {

    @Override
    public void run() {
        car.run();
        System.out.print("在街道道路上跑!");
    }
}
