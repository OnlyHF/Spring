package com.qzb.spring.ioc.proxy.aop;

import com.qzb.spring.ioc.proxy.jdk.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = context.getBean("helloProxy", Hello.class);
		hello.sayHello();
	}
}
