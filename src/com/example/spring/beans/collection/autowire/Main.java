package com.example.spring.beans.collection.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-autowire.xml");
	    Person person=(Person) ctx.getBean("person");
	    System.out.println(person);
	}
}
