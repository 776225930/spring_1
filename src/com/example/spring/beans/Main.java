package com.example.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		// ����һ��helloworld����
		// HelloWorld helloWorld=new HelloWorld();
		// Ϊname���Ը�ֵ
		// helloWorld.setName("Fuck Spring!!!");
		// ����hello����
		//1.����Spring��IOC��������
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC�����л�ȡBeanʵ��
	    //HelloWorld helloWorld=(HelloWorld) applicationContext.getBean("helloWorld");
		//helloWorld.hello();
		//Car car=(Car) applicationContext.getBean("car");
		//System.out.println(car);
		//Car car2=(Car) applicationContext.getBean("car2");
		//System.out.println(car2);
		Person person=(Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}
