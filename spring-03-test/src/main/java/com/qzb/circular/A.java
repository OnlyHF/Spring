package com.qzb.circular;

import org.springframework.stereotype.Component;

/**
 * 构造器注入实现循环依赖
 */
@Component
public class A {
	private B b;

	public A(B b) {
		this.b = b;
	}
}
