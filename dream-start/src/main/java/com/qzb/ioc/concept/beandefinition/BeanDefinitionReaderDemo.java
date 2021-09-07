package com.qzb.ioc.concept.beandefinition;

import com.qzb.ioc.concept.showcode.AppConfig;
import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanDefinition读取器(BeanDefinitionReader)，在使用spring的过程中用的少，但在spring源码中使用较多，相当于spring源码的基础设施
 *
 * 注意：它能解析的注解是：@Conditional，@Scope、@Lazy、@Primary、@DependsOn、@Role、@Description
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-06 22:32
 * @since 1.0.0
 **/
public class BeanDefinitionReaderDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
		
		annotatedBeanDefinitionReader.register(UserService.class);
		
		UserService userService = context.getBean("userService", UserService.class);
		userService.hello();
		
	}
	
}
