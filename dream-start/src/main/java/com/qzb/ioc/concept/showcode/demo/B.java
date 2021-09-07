package com.qzb.ioc.concept.showcode.demo;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:01
 * @since 1.0.0
 **/
@Order(2)
public class B {
	
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
