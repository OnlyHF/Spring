package com.qzb.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void test01() {
		String classPath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.helloWorld();

		helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.helloWorld();
	}

	@org.junit.Test
	public void test02() {
		String classpath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.sayHello();
		System.out.println(context.getBean("helloService"));
	}

	@org.junit.Test
	public void test03() {
		String classpath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		System.out.println(context.getBean("helloServiceFactory"));
	}

	@org.junit.Test
	public void test04() {
		String classpath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		System.out.println(context.getBean("helloService2"));

		System.out.println(context.getBean("helloServiceFactory") == context.getBean("helloService2"));
	}

	@org.junit.Test
	public void test05() {
		String classpath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		System.out.println(context.getBean("helloWorld2"));
		System.out.println(context.getBean("helloWorld2"));
		System.out.println(context.getBean("helloWorld3"));
		System.out.println(context.getBean("helloWorld3"));
	}

	@org.junit.Test
	public void test06() {
		String classpath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("person2"));
	}

	@org.junit.Test
	public void test07() {
		String classpath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		PersonAction action = context.getBean("personAction", PersonAction.class);
		action.hello();
	}
}
