package com.bryanrady.design.strategy;

/**
 * Created by Administrator on 2019/1/3.
 */

public class QueryUtils {

    public static String getUserInfo(Strategy strategy){
        if(strategy != null){
            String userInfo = strategy.getUserInfo();
            return userInfo;
        }
        throw new IllegalStateException("没有找到相应的用户信息!");
    }
}
