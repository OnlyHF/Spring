package com.qzb.ioc.concept.filter;

import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:20
 * @since 1.0.0
 **/
public class Demo {
	
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExcludeFilterConfig.class);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IncludeFilterConfig.class);
		
		UserService bean = context.getBean(UserService.class);
		
		bean.hello();
		
	}
	
}
