package com.bryanrady.design.adapter;

/**
 * Created by Administrator on 2019/1/3.
 */

public class ThreeServer implements Server {

    @Override
    public String getServerName() {
        return "三区服务器";
    }

    @Override
    public long getPlayerCount() {
        return ServerUtils.getOnlinePlayerCount(3);
    }
}
