package com.qzb.spring5.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(4)
public class PersonProxy {

	// 相同切入点抽取
	@Pointcut(value = "execution(* com.qzb.spring5.aop.annotation.User.add(..))")
	public void pointDemo() {

	}

	@Before(value = "pointDemo()")
	public void before() {
		System.out.println("com.qzb.spring5.aop.annotation.PersonProxy.before().....");
	}
}
