package com.qzb.ioc.concept.beandefinition;

import com.qzb.ioc.concept.showcode.AppConfig;
import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanDefinition表示Bean定义，BeanDefinition中存在很多属性用来描述一个Bean的特点；比如：
 * - class 表示Bean类型
 * - scop 表示Bean作用域
 * - lazyInit 表示Bean是否是懒加载
 * - destroyMethoName 表示Bean销毁时要执行的方法
 * - 还有其它很多
 *
 * 在Spring中，通常会以以下几种方式定义Bean：
 * - <bean/>
 * - @Bean
 * - @Component(@Server, @Controller ...)
 * 这些都称为声明式定义Bean
 *
 * 也可以通过编程式定义Bean，可以通过BeanDefinition，比如：该类
 *
 * 和声明式事务、编程式事务类似，通过<bean/>, @Bean, @Component 等声明式方法所定义的Bean，
 * 最终都会被Spring解析为对应的BeanDefinition对象，并放入到Spring容器中
 *
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-06 21:53
 * @since 1.0.0
 **/
public class BeanDefinitionDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(UserService.class);
//		beanDefinition.setScope("prototype");
		beanDefinition.setInitMethodName("initMethod");
		beanDefinition.setLazyInit(true);
		context.registerBeanDefinition("userService", beanDefinition);
		
		UserService userService = context.getBean("userService", UserService.class);
		
		userService.hello();
		
		UserService userService2 = context.getBean("userService", UserService.class);
		
		System.out.println(userService == userService2);
	}
	
}
