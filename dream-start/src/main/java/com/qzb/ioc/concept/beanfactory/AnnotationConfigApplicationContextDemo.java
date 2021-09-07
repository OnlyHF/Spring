package com.qzb.ioc.concept.beanfactory;

import com.qzb.ioc.concept.showcode.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/**
 * - ConfigurableApplicationContext : 继承了ApplicationContext接口，增加了，添加事件监听器、添加BeanFactoryPostProcessor、设置Environment，
 * 		获取ConfigurableListableBeanFactory等功能
 * - AbstractApplicationContext : 实现了ConfigurableApplicationContext接口
 * - GenericApplicationContext : 继承了AbstractApplicationContext，实现了BeanDefinitionRegistry接口，拥有了所有ApplicationContext的功能，
 * 		并且可以注册BeanDefinition，注意这个类中有一个属性(DefaultListableBeanFactory beanFactory)
 * - AnnotationConfigRegistry : 可以单独注册某个类为BeanDefinition(可以处理该类上的 @Configuration 注解，也可以处理 @Bean 注解)，同时可以扫描
 * - AnnotationConfigApplicationContext : 继承了GenericApplicationContext，实现了AnnotationConfigRegistry接口，拥有以上的所有功能
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 15:40
 * @since 1.0.0
 **/
public class AnnotationConfigApplicationContextDemo {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// 国际化
		String hello = context.getMessage("hello", null, new Locale("en_US"));
		System.out.println(hello);
		
		// 获取资源路径
		Resource resource = context.getResource("file:/Users/qianzhubing/workspace/idea/Spring/spring-framework/dream-start/src/main/java/com/qzb/ioc/concept/readme");
		System.out.println(resource.contentLength());
		System.out.println(resource.getFilename());
		
//		Resource resource1 = context.getResource("https://www.baidu.com");
//		System.out.println(resource1.contentLength());
//		System.out.println(resource1.getURI());
//		System.out.println(resource1.getURL());
		
		
		// 获取运行时环境
		// 可以使得某个properties文件中的参数添加到运行时环境中
		Map<String, Object> systemEnvironment = context.getEnvironment().getSystemEnvironment();
		System.out.println(systemEnvironment);
		System.out.println("----------------------------------");
		Map<String, Object> systemProperties = context.getEnvironment().getSystemProperties();
		System.out.println(systemProperties);
		System.out.println("----------------------------------");
		MutablePropertySources propertySources = context.getEnvironment().getPropertySources();
		System.out.println(propertySources);
		
		System.out.println(context.getEnvironment().getProperty("NO_PROXY"));
		System.out.println(context.getEnvironment().getProperty("sun.jnu.encoding"));
		
		
		// 事件发布
		context.publishEvent("hello spring");
		System.out.println();
		
	}
	
}
