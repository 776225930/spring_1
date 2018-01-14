package com.example.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		// 创建一个helloworld对象
		// HelloWorld helloWorld=new HelloWorld();
		// 为name属性赋值
		// helloWorld.setName("Fuck Spring!!!");
		// 调用hello方法
		//1.创建Spring的IOC容器对象
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean实例
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
