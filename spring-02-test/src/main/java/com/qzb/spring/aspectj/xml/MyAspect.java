package com.qzb.spring.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void before(JoinPoint joinPoint) {
		System.out.println("com.qzb.spring.aspectj.xml.MyAspect.before() 前置");
		System.out.println("joinPoint.getTarget(): " + joinPoint.getTarget());
		System.out.println("joinPoint.getSignature().getName(): " + joinPoint.getSignature().getName());
	}

	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("com.qzb.spring.aspectj.xml.MyAspect.after() 后置");
		System.out.println(joinPoint);
	}

	public Object around(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("com.qzb.spring.aspectj.xml.around() 环绕前");
		Object obj = null;
		try {
			obj = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("com.qzb.spring.aspectj.xml.around() 环绕后");
		return obj;
	}

	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("异常通知： " + e.getMessage());
	}

	public void after(JoinPoint joinPoint) {
		System.out.println("com.qzb.spring.aspectj.xml.after() 最终通知");
	}
}
