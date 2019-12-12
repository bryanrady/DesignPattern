package com.bryanrady.design.singleinstance;

/**
 * 懒汉式单例
 * Created by wangqingbin on 2019/1/2.
 */

public class LazyInstance {

    private static LazyInstance instance;

    private LazyInstance(){

    }

    /**
     * 线程不安全
     * @return
     */
    public static LazyInstance getInstance(){
        if(instance == null){
            instance = new LazyInstance();
        }
        return instance;
    }

    /**
     * 添加同步，线程安全
     * @return
     */
    public static synchronized LazyInstance getInstance2(){
        if(instance == null){
            instance = new LazyInstance();
        }
        return instance;
    }

    /**
        懒汉式单例模式是在需要的时候才去创建，如果调用该接口获取实例的时候，发现该实例不存在，
        就会被创建；如果发现该实例已经存在，就会返回之前已经创建出来的实例。但是懒汉模式的单例设计，
        是线程不安全的，没有考虑线程安全问题。如果你的程序是多线程的，而这些线程可能会同时运行这段代码。
        如果每次运行结果和单线程的运行结果一样的，而且其他的变量的值也和预期一样的，就是线程安全的。显然，
        懒汉式单例模式并不是线程安全的，在多线程并发环境下，可能会创建出来多个实例。

     　　使用场景：适合在项目中使用单例类数量较少，而且占用资源比较多的项目，可以考虑使用懒汉式单例模式。

     */
}
