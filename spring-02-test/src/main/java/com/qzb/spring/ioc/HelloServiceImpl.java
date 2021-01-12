package com.qzb.spring.ioc;

public class HelloServiceImpl implements HelloService {

	private HelloWorld helloWorld;

	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}

	@Override
	public void sayHello() {
		helloWorld.helloWorld();
		System.out.println("HelloService is over!!!");
	}
}
