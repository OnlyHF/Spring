package com.qzb.spring5.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 增强对类
@Component
@Aspect
public class UserProxy {

	// 前置通知
	// @Before注解表示作为前置通知
	@Before("execution(* com.qzb.spring5.aop.annotation.User.add(..))")
	public void before() {
		System.out.println("before");
	}


}
