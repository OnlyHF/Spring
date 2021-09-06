package com.qzb.ioc.selfwrite.spring.context;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-05 17:59
 * @since 1.0.0
 **/
public interface BeanPostProcessor {
	
	default Object postProcessBeforeInitialization(Object bean, String beanName) {
		return bean;
	}
	
	default Object postProcessAfterInitialization(Object bean, String beanName) {
		return bean;
	}
}
