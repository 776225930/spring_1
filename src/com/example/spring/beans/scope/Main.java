package com.example.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.spring.beans.collection.autowire.Address;
import com.example.spring.beans.collection.autowire.Car;
import com.example.spring.beans.collection.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-scope.xml");
	    Car car=(Car) ctx.getBean("car");
	    Car car2=(Car) ctx.getBean("car");
	    System.out.println(car==car2);
	}
}
