package com.qzb.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {

	public static void main(String[] args) {
		String filepath = "applicationContext.xml";
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(filepath);
		classPathXmlApplicationContext.getBean(HelloSpring.class);
	}

}
