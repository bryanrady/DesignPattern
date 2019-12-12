package com.bryanrady.design.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理对象  必须实现InvocationHandler接口
 * Created by wangqingbin on 2019/1/3.
 */

public class SubjectProxy implements InvocationHandler {

    //这个是我们要代理的真实对象
    private Object subject;

    public SubjectProxy(Object object){
        this.subject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //可以在代理真实对象之前进行一些自己的操作
        System.out.println("Mrthod :"+method);

        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象的handler对象的invoke方法来进行调用
        method.invoke(subject, args);

        //可以在代理真实对象之后进行一些自己的操作
        return null;
    }
}
