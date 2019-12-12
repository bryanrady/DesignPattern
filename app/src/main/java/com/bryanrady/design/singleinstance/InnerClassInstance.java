package com.bryanrady.design.singleinstance;

/**
 * 内部类单例 线程安全
 * Created by wangqingbin on 2019/1/2.
 */

public class InnerClassInstance {

    private InnerClassInstance(){

    }

    public static InnerClassInstance getInstance(){
        return Holder.INSTANCE;
    }

    private static class Holder{
        private static final InnerClassInstance INSTANCE = new InnerClassInstance();
    }

}
