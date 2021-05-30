package com.qzb.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ABConfig {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ABConfig.class);
		applicationContext.getBean(A.class);

		((AnnotationConfigApplicationContext) applicationContext).close();
	}

}
