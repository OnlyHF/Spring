package com.qzb.spring5.aop.annotation;

import org.springframework.stereotype.Component;

// 被增强对类
@Component
public class User {
	public void add() {
		System.out.println("com.qzb.spring5.aop.annotation.add()....");
	}
}
