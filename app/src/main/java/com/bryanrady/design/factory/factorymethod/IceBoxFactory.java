package com.bryanrady.design.factory.factorymethod;

/**
 * Created by Administrator on 2019/1/2.
 */

public class IceBoxFactory implements IFactory {

    @Override
    public Product createProduct() {
        return new IceBoxProduct();
    }

    /**
     * 在简单工厂的设计思路上，我们可以用类似的方法，定义一个工厂接口类，让一种特定的产品由一个特定的Factory去创建。
     */

    /**
     * 1.工厂模式的缺点：
     可以看出工厂方法的加入，使得对象的数量成倍增加。当产品种类非常多时，会出现大量的与之对应的工厂对象，这不是我们所希望的。
     我们可以考虑使用简单工厂模式与工厂方法模式相结合的方式来减少工厂类：
            即对于产品树上类似的种类（一般是树的叶子互为）兄弟的使用简单工厂模式来实现。

     2.工厂方法和简单工厂的区别：
     从上面创建产品对象的代码可以看出：简单工厂是把创建产品的职能都放在一个工厂类里面，而工厂方法则把不同的产品放在
     实现了工厂接口的不同工厂类里面，这样就算其中一个工厂类出了问题，其他工厂类也能正常工作，互相不受影响。以后增加新产品，
     也只需要新增一个实现工厂接口工厂类，不用修改已经有的代码。

     */
}
