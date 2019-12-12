package com.bryanrady.design.bridge;

/**
 * Created by Administrator on 2019/1/2.
 */

public abstract class AbstractRoad {

    //路上跑的是什么车
    public AbstractCar car;

    public abstract void run();
}
