package com.qzb.circular;

import org.springframework.stereotype.Component;

/**
 * 构造器注入实现循环依赖
 */
@Component
public class B {
	private A a;

	public B(A a) {
		this.a = a;
	}
}
