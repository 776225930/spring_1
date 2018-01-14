package com.example.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.beans.factorybean.Car;
/**
 * ʵ����������:ʵ�������ķ���. ����Ҫ�������������ڵ��ù�����ʵ������������bean��ʵ��
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
