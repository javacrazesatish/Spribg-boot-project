package com.satya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		ApplicationContext appcon= new ClassPathXmlApplicationContext("src/com/satya/applicationContext.xml"); 
		System.out.println("ApplicationContext  configure");
	}

}
