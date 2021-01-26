package com.qzb.spring5.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 增强对类
@Component
@Aspect
@Order(2)
public class UserProxy {

	// 相同切入点抽取
	@Pointcut(value = "execution(* com.qzb.spring5.aop.annotation.User.add(..))")
	public void pointDemo() {

	}

	// 前置通知
	// @Before注解表示作为前置通知
	@Before(value = "pointDemo()")
	public void before() {
		System.out.println("com.qzb.spring5.aop.annotation.UserProxy.before().....");
	}

	// 最终通知 - 有异常也会执行
	@After(value="pointDemo()")
	public void after() {
		System.out.println("com.qzb.spring5.aop.annotation.UserProxy.after()....");
	}

	// 有异常则不执行 - 后置通知
	@AfterReturning(value="pointDemo()")
	public void afterReturning() {
		System.out.println("com.qzb.spring5.aop.annotation.UserProxy.afterReturning()....");
	}

	// 异常通知
	@AfterThrowing(value="pointDemo()")
	public void afterThrowing() {
		System.out.println("com.qzb.spring5.aop.annotation.UserProxy.afterThrowing....");
	}

	@Around(value="pointDemo()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("com.qzb.spring5.aop.annotation.UserProxy.around() before ....");
		// 被增强的方法
		proceedingJoinPoint.proceed();
		System.out.println("com.qzb.spring5.aop.annotation.UserProxy.around() after ....");
	}

}
