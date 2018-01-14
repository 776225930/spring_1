package com.example.spring.beans;

public class HelloWorld {
    private String name;
    public void setName(String name) {
    	  System.out.println("Helloworld!!-->setName");
		this.name = name;
	}
    public void hello(){
    	System.out.println("hello:"+name+"!!");
    }
    public HelloWorld() {
      System.out.println("Helloworld!!");
    }
}
