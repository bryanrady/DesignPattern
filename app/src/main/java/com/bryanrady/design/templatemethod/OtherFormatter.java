package com.bryanrady.design.templatemethod;

/**
 * Created by Administrator on 2019/1/3.
 */

public class OtherFormatter extends Formatter {

    @Override
    public String formatting(UserInfo info) {
        return "转换成了其他类型格式";
    }
}
