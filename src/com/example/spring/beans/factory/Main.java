package com.example.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.spring.beans.factorybean.Car;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-factory.xml");
	    Car car=(Car) ctx.getBean("car2");
	    System.out.println(car);
	}
}
