package com.bryanrady.design.bridge;

/**
 * 新手
 * Created by Administrator on 2019/1/3.
 */

public class Novice extends AbstractDriver {

    @Override
    public void run() {
        System.out.print("新手开着 ");
        road.run();
    }
}
