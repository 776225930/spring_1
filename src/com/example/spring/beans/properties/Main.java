package com.example.spring.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.spring.beans.collection.autowire.Address;
import com.example.spring.beans.collection.autowire.Person;

public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-properties.xml");
        DataSource dataSource=(DataSource) ctx.getBean("dataSource");
	    System.out.println(dataSource.getConnection());
	}
}
