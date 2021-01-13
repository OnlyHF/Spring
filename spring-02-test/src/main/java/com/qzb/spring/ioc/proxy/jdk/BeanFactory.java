package com.qzb.spring.ioc.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BeanFactory {

	/**
	 * jdk动态代理
	 */
	public static Hello getBean() {
		final Hello hello = new HelloImpl();
		AspectHello aspectHello = new AspectHello();
		return (Hello)Proxy.newProxyInstance(BeanFactory.class.getClassLoader(), new Class[]{ Hello.class }, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				aspectHello.before();
				Object obj = method.invoke(hello, args);
				aspectHello.after();
				return obj;
			}
		});
	}
}
