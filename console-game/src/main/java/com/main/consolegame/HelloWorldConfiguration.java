package com.main.consolegame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name()	{	return "Feina";}
	@Bean
	public int age()	{	return 28;}
	
}
