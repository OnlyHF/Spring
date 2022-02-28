package com.qzb.ioc.source.postprocessor;

import com.qzb.ioc.source.service.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-14 22:09
 * @since 1.0.0
 **/
@Component
public class QzbInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInstantiation(final Class<?> beanClass, final String beanName) throws BeansException {

		// 如果是这样，表示不需要Spring来实例化了，并且后续的Spring依赖注入也不会进行了，会跳过一些步骤，直接执行初始化后这一步
//		if ("helloService".equals(beanName)) {
//			System.out.println("实例化之前....");
//			return new HelloService();
//		}

		return null;
	}
	
	
}
