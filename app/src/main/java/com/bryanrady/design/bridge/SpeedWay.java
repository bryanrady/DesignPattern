package com.bryanrady.design.bridge;

/**
 * Created by Administrator on 2019/1/3.
 */

public class SpeedWay extends AbstractRoad {

    @Override
    public void run() {
        car.run();
        System.out.print("在高速道路上跑!");
    }
}
