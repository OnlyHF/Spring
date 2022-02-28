package com.qzb.ioc.beanfactorypostprocessor;

import com.qzb.ioc.construct.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-12-21 19:26
 * @since 1.0.0
 **/
@ComponentScan("com.qzb.ioc.beanfactorypostprocessor")
@Configuration
public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Start.class);
		User bean = context.getBean(User.class);
		User bean2 = context.getBean(User.class);
		System.out.println(bean == bean2);
	}

}
