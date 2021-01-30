package com.test;

import com.qzb.spring5.jdbctemplate.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void test() {
		String classpath = "bean8.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		TestService testService = context.getBean("testService", TestService.class);
		testService.add();
		System.out.println("over!!!");
	}
}
