package com.bryanrady.design.templatemethod;

/**
 * 这是一个模板 用来做专门的事情
 * Created by wangiqngbin on 2019/1/3.
 */

public abstract class Formatter {

    /**
     * 将对象转换成相应的格式 xml、json、其他
     * @param info
     * @return
     */
    public String format(UserInfo info){
        String result = formatting(info);
        return result;
    }

    protected abstract String formatting(UserInfo info);

}
