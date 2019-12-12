package com.bryanrady.design.factory.simplefactory;

/**
 * 工厂类
 * Created by wangqingbin on 2019/1/2.
 */

public class SimpleFactory {

    public static IProduct create(String className){
        IProduct iProduct = null;
        if(className != null){
            if(className.equals(AndroidProductFactory.class.getName())){
                iProduct = new AndroidProductFactory();
            }else if(className.equals(IosProductFactory.class.getName())){
                iProduct = new IosProductFactory();
            }else if(className.equals(PhpProductFactory.class.getName())){
                iProduct = new PhpProductFactory();
            }else{
                //最后来个默认的 不让这个方法返回空
                iProduct = new AndroidProductFactory();
            }
        }
        return iProduct;
    }

    /**
     * 简单工厂模式
     *      将对象的创建和使用分离，也就是在客户端与生产之间搭建一个中间类，这个类通过控制产品类的创建返回给客户端一个期望的值。
     *
     * 简单工厂模式的优点：
     　　1- 客户端可以免除创建一个工厂类的实例，并且可以直接通过工厂类的静态方法来获得自己想要的产品，
            降低了客户端和工厂类的耦合，实现了对象的创建和使用分离。

     　　2- 工厂类只是去调用产品实现类去获得产品的实例，自己并没有去创建。
     */

}
