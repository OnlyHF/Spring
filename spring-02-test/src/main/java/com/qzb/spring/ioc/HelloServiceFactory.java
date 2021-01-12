package com.qzb.spring.ioc;

public class HelloServiceFactory {

	public static HelloService createBean() {
		return new HelloServiceImpl();
	}
}
