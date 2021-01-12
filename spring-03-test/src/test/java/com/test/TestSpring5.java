package com.test;

import com.qzb.spring5.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

	@org.junit.Test
	public void testAdd() {
		String classpath = "bean1.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		User user = context.getBean("user", User.class);
		user.add();
	}
}
