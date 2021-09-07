package com.qzb.ioc.concept.showcode.demo;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 21:59
 * @since 1.0.0
 **/
@Order(3)
public class A {
	
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
