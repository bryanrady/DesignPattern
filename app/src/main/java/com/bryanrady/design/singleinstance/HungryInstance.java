package com.bryanrady.design.singleinstance;

/**
 * 饿汉式单例  线程安全
 * Created by wangqingbin on 2019/1/2.
 */

public class HungryInstance {

    private static HungryInstance instance = new HungryInstance();

    private HungryInstance(){

    }

    public static HungryInstance getInstance(){
        return instance;
    }

    /**
       饿汉模式在类加载的时候就对该实例进行创建，实例在整个程序周期都存在。

     　优点：只在类加载的时候创建一次，不会存在多个线程创建多个实例的情况，避免了多线程同步的问题，是线程安全的。

     　缺点：在整个程序周期中，即使这个单例没有被用到也会被加载，而且在类加载之后就被创建，内存就被浪费了。

     　使用场景：适合单例占用内存比较小，在初始化就被用到的情况。但是，如果单例占用的内存比较大，或者单例只是在某个
                场景下才会被使用到，使用该模式就不合适了，这时候就要考虑使用“懒汉模式”进行延迟加载。
     */
}
