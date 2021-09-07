package com.qzb.ioc.concept.beandefinition;

import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * ClassPathBeanDefinitionScanner 是扫描器，但是它的作用和BeanDefinitionReader类似，它可以进行扫描，扫描某个包路径，对扫描到的类进行解析，
 * 比如，扫描到的类上如果存在 @Component 注解，那么就会把这个类解析为一个BeanDefinition
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-06 22:50
 * @since 1.0.0
 **/
public class ClassPathBeanDefinitionScannerDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		
		ClassPathBeanDefinitionScanner classPathBeanDefinitionScanner = new ClassPathBeanDefinitionScanner(context);
		classPathBeanDefinitionScanner.scan("com.qzb.ioc.concept.showcode");
		
		Object userService = context.getBean("userService", UserService.class);
		
		((UserService) userService).hello();
		
	}
	
}
