package com.qzb.spring.ioc;

public class HelloServiceFactory2 {

	public HelloService createBean() {
		return new HelloServiceImpl();
	}
}
