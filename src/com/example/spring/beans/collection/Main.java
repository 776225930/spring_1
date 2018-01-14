package com.example.spring.beans.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person=(Person) applicationContext.getBean("person5");
		System.out.println(person);
	    DataSource dataSource=applicationContext.getBean(DataSource.class);
	    System.out.println(dataSource.getProperties());
	}
}
