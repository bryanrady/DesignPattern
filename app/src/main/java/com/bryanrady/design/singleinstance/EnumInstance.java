package com.bryanrady.design.singleinstance;

/**
 * 枚举单例  线程安全
 * Created by wangqingbin on 2019/1/2.
 */

public enum EnumInstance {
    INSTANCE;

    private Resource intatnce;

    EnumInstance(){
        intatnce = new Resource();
    }

    public Resource getInstance(){
        return intatnce;
    }

    /**
     * 首先，在枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，
     * 同时每个枚举实例都是static final类型的，也就表明只能被实例化一次。在调用构造方法时，
     * 我们的单例被实例化。也就是说，因为enum中的实例被保证只会被实例化一次，所以我们的INSTANCE也就会被实例化一次。
     　　
     在之前介绍的实现单例的方式中都有共同的缺点：
     (1).需要额外的工作来实现序列化，否则每次反序列化一个序列化的对象时都会创建一个新的实例；
     (2).可以使用反射强行调用私有构造器(如果要避免这个情况，可以修改构造器，让它在创建第二个人实例的时候抛异常。)
        这个会在第5点中进行介绍而使用枚举出了线程安全和防止反射调用构造器之外，还提供了自动序列化机制，防止反序列化
        的时候创建新的对象。
     */
}
