package com.example.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.beans.factorybean.Car;

/**
 * ��̬��������:ֱ�ӵ���ĳһ����ľ�̬�����Ϳ��Է���bean��ʵ��
 * @author JHao
 *
 */
public class StaticCarFactory {
    private static Map<String,Car> cars=new HashMap<String, Car>();
	
    static{
    	cars.put("audi", new Car("audi",300000));
    	cars.put("ford", new Car("ford",300000));
    }
    //��̬��������
    public static Car getCar(String name){
		return cars.get(name);
	}
}