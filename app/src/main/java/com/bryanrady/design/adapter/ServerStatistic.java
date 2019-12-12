package com.bryanrady.design.adapter;

/**
 * Created by Administrator on 2019/1/3.
 */

public class ServerStatistic implements Statistic {

    //假如现在 突然有个问题，原来的一区服务器早已上线，已经有了统计功能，那我们是否需要重新建一个专门
    //的类来进行实现，当然是不需要的。这样我们就可以用适配器模式了,对一区服务器进行适配.

    @Override
    public long getAllPlayerCount() {
        Server server1 = new OneServer();
        Server server2 = new TwoServer();
        Server server3 = new ThreeServer();
        long count = server1.getPlayerCount() + server2.getPlayerCount() + server3.getPlayerCount();
        return count;
    }
}
