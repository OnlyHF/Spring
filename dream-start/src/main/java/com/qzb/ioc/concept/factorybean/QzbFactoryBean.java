package com.qzb.ioc.concept.factorybean;

import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 该段代码，创造了UserService对象，并将它成为Bean；但是通过这种方式创造出来的Bean，只会经过初始化后，其它Spring的生命周期步骤是不会经过的，比如依赖注入；
 *
 * 通过注解@Bean可以自己生成一个对象作为Bean，那么和FactoryBean的区别是什么呢？
 * - 其实在很多场景下它俩是可以替换的，但是站在原理层面来说，区别很明显，@Bean定义的Bean是会经过完整的Bean生命周期的；
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:28
 * @since 1.0.0
 **/
@Component
public class QzbFactoryBean implements FactoryBean {
	
	@Override
	public Object getObject() throws Exception {
		UserService userService = new UserService();
		return userService;
	}
	
	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}
	

}
