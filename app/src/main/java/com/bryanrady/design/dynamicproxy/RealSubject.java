package com.bryanrady.design.dynamicproxy;

/**
 * 真实的对象 就是被代理的对象
 * Created by wangqingbin on 2019/1/3.
 */

public class RealSubject implements Subject {

    @Override
    public void sayHello() {
        System.out.println("你好，很高兴遇到你!");
    }

    @Override
    public void sayByebye() {
        System.out.println("拜拜，期待下次相见!");
    }
}
