package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStringApp {

	public static void main(String[] args) {
		//to load the spring xml file
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		//to get the object
		
		Student sob=(Student) context.getBean("studentob");
		sob.display();
		//to call the method
		
		Student sob1=(Student) context.getBean("studentob1");
		sob1.display();
	}

}
