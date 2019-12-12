package com.bryanrady.design.bridge;

/**
 * Created by Administrator on 2019/1/2.
 */

public abstract class AbstractDriver {

    //司机走的是什么路
    public AbstractRoad road;

    public abstract void run();

}
