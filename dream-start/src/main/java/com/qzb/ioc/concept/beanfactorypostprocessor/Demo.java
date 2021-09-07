package com.qzb.ioc.concept.beanfactorypostprocessor;

import com.qzb.ioc.concept.showcode.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:20
 * @since 1.0.0
 **/
public class Demo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
	
}
