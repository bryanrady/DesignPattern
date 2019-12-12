package com.bryanrady.design.adapter;

/**
 * Created by Administrator on 2019/1/3.
 */

public class TwoServer implements Server {

    @Override
    public String getServerName() {
        return "二区服务器";
    }

    @Override
    public long getPlayerCount() {
        return ServerUtils.getOnlinePlayerCount(2);
    }
}
