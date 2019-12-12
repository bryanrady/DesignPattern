package com.bryanrady.design.bridge;

/**
 *
 * 老司机
 * Created by Administrator on 2019/1/3.
 */

public class OldDriver extends AbstractDriver {

    @Override
    public void run() {
        System.out.print("老司机开着 ");
        road.run();
    }
}
