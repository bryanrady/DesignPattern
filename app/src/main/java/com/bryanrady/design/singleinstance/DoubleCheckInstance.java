package com.bryanrady.design.singleinstance;

/**
 * 双重检查单例  线程安全
 * Created by wangqingbin on 2019/1/2.
 */

public class DoubleCheckInstance {

//    private static DoubleCheckInstance instance;

    //volatile 禁止指令重排优化
    private volatile static DoubleCheckInstance instance;

    private DoubleCheckInstance(){

    }

    public static DoubleCheckInstance getInstance(){
        if(instance == null){
            synchronized (DoubleCheckInstance.class){
                if(instance == null){
                    instance = new DoubleCheckInstance();
                }
            }
        }
        return instance;
    }

    /**
     * 在加锁的懒汉模式中，看似解决了线程的并发安全问题，有实现了延迟加载，然而它存在着性能问题。synchronized修饰的同步
     * 方法比一般方法要慢很多，如果多次调用getInstance()，累积的性能损耗就比较大了。因此，我们这里就有了双重校验锁。
     * 在上面的双重校验锁代码中，由于单例对象只需要创建一次，如果后面再次调用getInstance()只需要直接返回单例对象。

     因此，大部分情况下，调用getInstance()都不会执行到同步代码块中的代码，从而提高了性能。

     不过，在这里要提到Java中的指令重排优化。指令重排优化：在不改变原语义的情况下，通过调整指令的执行顺序让程序运行的更快。

     由于指令重拍优化的存在，导致初始化Singleton3和将对象地址付给instance字段的顺序是不确定的。比如：在某个线程创建单例对象时，
     在构造方法被调用之前，就为该对象分配了内存空间并将对象的字段设置为默认值。此时就可以将分配的内存地址复制给instance字段了，
     然后该对象可能还没有初始化。若紧接着另外一个线程来调用getInstance,得到的是状态不确定的对象，程序就会出错。

     以上就是双重校验锁会失效的原因。不过在JDK1.5及其以后的版本中，增加了volatile关键字。
     volatile的关键字的一个语义就是禁止指令重排优化，这样就保证了instance变量被赋值的时候已经是初始化的，
     避免了上面提到的状态不确定的问题。
     */

}
