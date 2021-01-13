package com.qzb.spring.ioc.proxy.cglib;

import com.qzb.spring.ioc.proxy.jdk.HelloImpl;

public class Test {

	@org.junit.Test
	public void test() {
		HelloImpl hello = CglibFactory.getBean();
		hello.sayHello();
		System.out.println(hello);
	}
}
