package com.qzb.spring.ioc.proxy.cglib;

import com.qzb.spring.ioc.proxy.jdk.AspectHello;
import com.qzb.spring.ioc.proxy.jdk.HelloImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibFactory {

	public static HelloImpl getBean() {
		HelloImpl hello = new HelloImpl();
		AspectHello aspectHello = new AspectHello();
		// 生成代理类，CGLIB在运行时，生成指定对象的子类，增强
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(hello.getClass());
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				aspectHello.before();
				Object obj = method.invoke(hello, args);
				aspectHello.after();
				return obj;
			}
		});
		return (HelloImpl)enhancer.create();
	}


}
