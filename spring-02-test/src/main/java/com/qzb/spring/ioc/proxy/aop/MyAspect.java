package com.qzb.spring.ioc.proxy.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("com.qzb.spring.ioc.proxy.aop.MyAspect starting ... ");
		Object obj = invocation.proceed();
		System.out.println("com.qzb.spring.ioc.proxy.aop.MyAspect end ... ");
		return obj;
	}
}
