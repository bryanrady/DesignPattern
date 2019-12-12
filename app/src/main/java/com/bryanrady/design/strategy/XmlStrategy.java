package com.bryanrady.design.strategy;

/**
 * 查出来的用户信息以xml格式返回给客户端
 * Created by wangqingbin on 2019/1/3.
 */

public class XmlStrategy implements Strategy {

    @Override
    public String getUserInfo() {
        return "查出来的用户信息以xml格式返回给客户端";
    }
}
