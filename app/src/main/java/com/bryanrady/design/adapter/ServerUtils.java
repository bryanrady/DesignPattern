package com.bryanrady.design.adapter;

/**
 * Created by Administrator on 2019/1/3.
 */

public class ServerUtils {

    /**
     * 根据相应的服务器编号查询在线人数
     * @param code
     * @return  返回1就是查询成功之后的数据 -1就是没有的
     */
    public static long getOnlinePlayerCount(int code){
        if(code == 1 || code == 2 || code == 3){
            return 1;
        }
        return -1;
    }
}
