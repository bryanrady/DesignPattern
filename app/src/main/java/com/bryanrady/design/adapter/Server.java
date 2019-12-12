package com.bryanrady.design.adapter;

/**
 * 游戏服务器接口
 * Created by wangqingbin on 2019/1/3.
 */

public interface Server {

    String getServerName();

    /**
     * 统计在线玩家数量
     * @return
     */
    long getPlayerCount();

}
