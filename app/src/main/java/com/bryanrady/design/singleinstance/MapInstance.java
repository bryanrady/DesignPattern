package com.bryanrady.design.singleinstance;

import java.util.HashMap;
import java.util.Map;

/**
 * map登记式单例模式   线程安全
 * 就是将该类名进行登记，每次调用前查询，如果存在，则直接使用；不存在，则进行登记。
 * Created by wangqingbin on 2019/1/2.
 */

public class MapInstance {

    private static Map<String,MapInstance> map = new HashMap<>();

    static{
        MapInstance mapInstance = new MapInstance();
        map.put(MapInstance.class.getName(),mapInstance);
    }

    private MapInstance(){

    }

    public static MapInstance getInstance(String className){
        if(className == null){
            className = MapInstance.class.getName();
        }
        if(map.get(className) == null){
            try {
                //通过类名反射得出实例
                map.put(className, (MapInstance) Class.forName(className).newInstance());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(className);
    }

}
