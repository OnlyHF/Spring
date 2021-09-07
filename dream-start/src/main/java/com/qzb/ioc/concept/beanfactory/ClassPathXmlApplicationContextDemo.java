package com.qzb.ioc.concept.beanfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassPathXmlApplicationContext也是继承了AbstractApplicationContext，但是相对于AnnotationConfigApplicationContext而言，
 * 	功能没有AnnotationConfigApplicationContext强大，比如不能注册BeanDefinition
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 15:53
 * @since 1.0.0
 **/
public class ClassPathXmlApplicationContextDemo {
	
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		
	}
	
}
