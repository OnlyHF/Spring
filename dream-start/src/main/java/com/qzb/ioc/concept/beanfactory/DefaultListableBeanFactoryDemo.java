package com.qzb.ioc.concept.beanfactory;

import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 1、BeanFactory表示Bean工厂，BeanFactory会负责创建Bean，并提供获取Bean的API
 * 2、而ApplicationContext也是BeanFactory的一种，在spring源码中，定义为：
 * public interface ApplicationContext extends EnvironmentCapable, ListableBeanFactory, HierarchicalBeanFactory,
 * 		MessageSource, ApplicationEventPublisher, ResourcePatternResolver {
 *
 * 3、在Java中，接口是可以多继承的，ApplicationContext继承了ListableBeanFactory和HierarchicalBeanFactory，而ListableBeanFactory和HierarchicalBeanFactory
 * 都继承与BeanFactory，因此ApplicationContext也是继承了BeanFactory；
 * 4、ApplicationContext属于BeanFactory的一种，拥有BeanFactory支持的所有功能，不过ApplicationContext比BeanFactory更加强大，ApplicationContext还继承了其它接口，
 * 也就是表示ApplicationContext还拥有其它功能，比如MessageSource表示国际化，AppliationEventPublisher表示事件发布，EnvironmentCapable表示获取环境变量，等等
 *
 * 5、在Spring源码中，当new一个ApplicationContext时，其底层会new一个BeanFactory，当使用ApplicationContext的某些方法时，比如getBean()，底层调用的是BeanFactory的getBean()方法
 * 6、在spring源码中，BeanFactory接口存在一个非常重要的实现类：DefaultListableBeanFactory
 *
 * DefaultListableBeanFactory实现了很多接口，即同时拥有了很多功能：
 * - AliasRegistry : 支持别名功能，一个名字可以对应多个别名
 * - BeanDefinitionRegistry : 可以注册、保存、移除、获取某个BeanDefinition
 * - BeanFactory : Bean工厂，可以根据某个Bean的名字、类型、别名获取某个Bean对象
 * - SingletonBeanRegistry : 可以直接注册、获取某个单例Bean
 * - SimpleAliasRegistry : 它是一个类，实现AliasRegistry接口中所定义的功能，支持别名功能
 * - ListableBeanFactory : 在BeanFactory的基础上，增加了其它功能，可以获取所有BeanDefinition的BeanNames，可以根据某个类型获取对应的beanNames，可以根据某个类型获取{类型: 对应的Bean}的映射关系
 * - HierarchicalBeanFactory : 在BeanFactory的基础上，添加了获取父BeanFactory的功能
 * - DefaultSingletonBeanRegistry : 它是个类，实现类SingletonBeanRegistry接口，拥有了直接注册、获取某个单例Bean的功能
 * - ConfigurableBeanRegistry : 在HierachicalBeanFactory和SingletonBeanRegistry的基础上，添加了设置父BeanFactory、类加载器(表示可以指定某个类加载器进行类的加载)、
 *     设置Spring EL表达式解析器(表示该BeanFactory可以解析EL表达式)、设置类型转化服务(表示该BeanFactory可以进行类型转化)、可以添加BeanPostProcessor(表示该BeanFactory支持Bean的后置处理器)，
 *     可以合并BeanDefinition，可以销毁某个Bean等等功能
 * - FactoryBeanRegistrySupport : 支持了FactoryBean的功能
 * - AutowireCapableBeanFactory : 是直接继承了BeanFactory，在BeanFactory的基础上，支持在创建Bean的过程中能对Bean进行自动装配
 * - AbstractBeanFactory : 实现了ConfigurableBeanFactory接口，继承了FactoryBeanRegistrySupport，这个BeanFactory的功能已经很全面了，但是不能自动装配和获取beanNames
 * - ConfigurableListableBeanFactory : 继承了ListableBeanFactory、AutowireCapableBeanFactory、ConfigurableBeanFactory
 * - AbstractAutowireCapableBeanFactory : 继承了AbstractBeanFactory，实现了AutowireCapableBeanFactory，拥有了自动装配的功能
 * - DefaultListableBeanFactory : 继承了AbstractAutowireCapableBeanFactory，实现ConfigurableListableBeanFactory接口和BeanDefinitionRegistry接口，所以DefaultListableBeanFactory的功能很强大
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 10:46
 * @since 1.0.0
 **/
public class DefaultListableBeanFactoryDemo {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(UserService.class);
		
		beanFactory.registerBeanDefinition("userService", beanDefinition);
		
		UserService userService = beanFactory.getBean("userService", UserService.class);
		
		userService.hello();
		
	}
	
}
