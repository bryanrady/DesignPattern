package com.bryanrady.design;

import com.bryanrady.design.adapter.ServerStatistic;
import com.bryanrady.design.adapter.Statistic;
import com.bryanrady.design.bridge.AbstractDriver;
import com.bryanrady.design.bridge.AbstractRoad;
import com.bryanrady.design.bridge.Bus;
import com.bryanrady.design.bridge.Car;
import com.bryanrady.design.bridge.Novice;
import com.bryanrady.design.bridge.OldDriver;
import com.bryanrady.design.bridge.SpeedWay;
import com.bryanrady.design.bridge.StreetWay;
import com.bryanrady.design.dynamicproxy.RealSubject;
import com.bryanrady.design.dynamicproxy.Subject;
import com.bryanrady.design.dynamicproxy.SubjectProxy;
import com.bryanrady.design.facaed.Computer;
import com.bryanrady.design.factory.abstractfactory.FactoryA;
import com.bryanrady.design.factory.abstractfactory.FactoryB;
import com.bryanrady.design.factory.abstractfactory.IAbstractFactory;
import com.bryanrady.design.factory.factorymethod.IFactory;
import com.bryanrady.design.factory.factorymethod.IceBoxFactory;
import com.bryanrady.design.factory.factorymethod.WasherFactory;
import com.bryanrady.design.factory.simplefactory.AndroidProductFactory;
import com.bryanrady.design.factory.simplefactory.IProduct;
import com.bryanrady.design.factory.simplefactory.IosProductFactory;
import com.bryanrady.design.factory.simplefactory.PhpProductFactory;
import com.bryanrady.design.factory.simplefactory.SimpleFactory;
import com.bryanrady.design.strategy.JsonStrategy;
import com.bryanrady.design.strategy.QueryUtils;
import com.bryanrady.design.strategy.XmlStrategy;
import com.bryanrady.design.templatemethod.Formatter;
import com.bryanrady.design.templatemethod.JsonFormatter;
import com.bryanrady.design.templatemethod.UserInfo;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testSimpleFactory(){
        IProduct androidProduct = new AndroidProductFactory();
        androidProduct.makeProduct();
        IProduct iosProduct = new IosProductFactory();
        iosProduct.makeProduct();
        IProduct phpProduct = new PhpProductFactory();
        phpProduct.makeProduct();

        //上面这是原始的调用方式 现在我们来使用简单工厂模式来进行下封装

        IProduct iProduct1 = SimpleFactory.create(AndroidProductFactory.class.getName());
        iProduct1.makeProduct();
        IProduct iProduct2 = SimpleFactory.create(IosProductFactory.class.getName());
        iProduct2.makeProduct();
        IProduct iProduct3 = SimpleFactory.create(PhpProductFactory.class.getName());
        iProduct3.makeProduct();
    }

    @Test
    public void testFactoryMethod(){
        IFactory factory1 = new IceBoxFactory();
        String productMode1 = factory1.createProduct().getProductMode();
        System.out.println(productMode1);
        IFactory factory2 = new WasherFactory();
        String productMode2 = factory2.createProduct().getProductMode();
        System.out.println(productMode2);
    }

    @Test
    public void testAbstractFactory(){
        IAbstractFactory factoryA = new FactoryA();
        factoryA.createIceBox();
        factoryA.createWasher();
        IAbstractFactory factoryB = new FactoryB();
        factoryB.createIceBox();
        factoryB.createWasher();

        //这里还可以继续对两个工厂进行简单工厂封装
    }

    @Test
    public void testBridgeMode(){
        AbstractRoad road = new SpeedWay();
        road.car = new Car();
        AbstractDriver driver = new OldDriver();
        driver.road = road;
        driver.run();

        AbstractRoad road1 = new StreetWay();
        road1.car = new Bus();
        AbstractDriver driver1 = new Novice();
        driver1.road = road1;
        driver1.run();

        /**
         * 桥接模式：它把原来的基类的实现化细节抽象出来，再构造一个实现化的结构中，
         * 然后把原来的基类改造成一个抽象化的等级结构，这样就可以实现在多个维度上的独立自由变化。
         */
    }

    @Test
    public void testStrategy(){
        String userInfo = QueryUtils.getUserInfo(new JsonStrategy());
        System.out.println(userInfo);
        String userInfo1 = QueryUtils.getUserInfo(new XmlStrategy());
        System.out.println(userInfo1);
    }

    @Test
    public void testTemplateMethod(){
        //模板方法看似和策略模式有点像
        Formatter formatter = new JsonFormatter();
        String result = formatter.format(new UserInfo("张三", 21));
        System.out.println(result);
    }

    @Test
    public void getAllPlayerCount() {
        Statistic statistic = new ServerStatistic();
        long count = statistic.getAllPlayerCount();
        System.out.println(count);
    }

    @Test
    public void testFacaed() {
        Computer computer = new Computer();
        computer.start();
        computer.shutdown();
    }

    @Test
    public void testDynamicProxy() {
        Subject realSubject = new RealSubject();
        InvocationHandler handler = new SubjectProxy(realSubject);

        /**
         * 通过Proxy的newInstance方法来创建我们的代理对象
         * 第一个参数handler.getClass().getClassLoader(),我们这里使用这个
         * handler这个类的ClassLoader对象来加载我们的代理对象；
         * 第二个参数realSubject.getClass().getInterface(),我们这里为代理对象提供的接口
         * 是真实对象所实现的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了；
         * 第三个参数handler,这里讲这个代理对象关联到上方的InvocationHandler这个对象上
         */
        Subject subject = (Subject) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                handler
        );
        subject.sayHello();
        subject.sayByebye();
    }
}