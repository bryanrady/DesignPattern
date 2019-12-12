package com.bryanrady.design.adapter;

/**
 * Created by Administrator on 2019/1/3.
 */

public class OneServer implements Server {

    private ServerFirst serverFirst;

    public OneServer(){
        serverFirst = new ServerFirst();
    }

    @Override
    public String getServerName() {
        return "一区服务器";
    }

    @Override
    public long getPlayerCount() {
    //    return ServerUtils.getOnlinePlayerCount(1);
        return serverFirst.getPlayerCount();
    }
}
