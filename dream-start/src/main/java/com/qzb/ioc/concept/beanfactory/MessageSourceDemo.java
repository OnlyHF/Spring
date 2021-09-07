package com.qzb.ioc.concept.beanfactory;

import com.qzb.ioc.concept.showcode.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 *
 * AppConfig 中配置 messageSource 的bean
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 16:00
 * @since 1.0.0
 **/
public class MessageSourceDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		String hello = context.getMessage("hello", null, new Locale("en_US"));
		System.out.println(hello);
		
	}
	
}
