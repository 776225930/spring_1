package com.example.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.beans.factorybean.Car;
/**
 * 实例工厂方法:实例工厂的方法. 既需要创建工厂本身，在调用工厂的实例方法来返回bean的实例
 * @author JHao
 *
 */
public class InstanceCarFactory {
     private Map<String,Car> cars=null;
     public InstanceCarFactory(){
    	 cars=new HashMap<String,Car>();
    	 cars.put("audi",new Car("audi",400000));
    	 cars.put("ford",new Car("ford",200000));
     }
     
     public Car getCar(String name){
    	 return cars.get(name);
     }
}
