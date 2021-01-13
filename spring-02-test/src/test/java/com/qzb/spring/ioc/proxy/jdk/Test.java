package com.qzb.spring.ioc.proxy.jdk;

public class Test {

	@org.junit.Test
	public void test01() {
		Hello hello = BeanFactory.getBean();
		hello.sayHello();
	}

}
