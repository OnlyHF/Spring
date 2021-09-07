package com.qzb.ioc.concept.beandefinition;

import com.qzb.ioc.concept.showcode.AppConfig;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * 用于解析xml文件中的bean
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-06 22:44
 * @since 1.0.0
 **/
public class XmlBeanDefinitionReaderDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
		
		int i = xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");
		
		System.out.println(i);
	}
	
}
