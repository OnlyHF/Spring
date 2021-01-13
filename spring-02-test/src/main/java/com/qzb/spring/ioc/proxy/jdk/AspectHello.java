package com.qzb.spring.ioc.proxy.jdk;

public class AspectHello {

	public void before() {
		System.out.println("com.qzb.spring.ioc.proxy.jdk.before() is executing ... ");
	}

	public void after() {
		System.out.println("com.qzb.spring.ioc.proxy.jdk.after() is executing ... ");
	}
}
