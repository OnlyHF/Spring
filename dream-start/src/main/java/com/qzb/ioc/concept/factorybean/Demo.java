package com.qzb.ioc.concept.factorybean;

import com.qzb.ioc.concept.showcode.AppConfig;
import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:20
 * @since 1.0.0
 **/
public class Demo {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.hello();
		
	}
	
}
