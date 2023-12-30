package com.main.consolegame;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(
				context.getBean("name")
				);
	}
}
