package com.qzb.ioc.selfwrite.service.bean;

import com.qzb.ioc.selfwrite.spring.annotation.Component;
import com.qzb.ioc.selfwrite.spring.context.BeanPostProcessor;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-05 18:16
 * @since 1.0.0
 **/
@Component
public class HelloPostProcessor implements BeanPostProcessor {
	
	/**
	 * 此处可以进行代理操作
	 * @param bean
	 * @param beanName
	 * @return
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, final String beanName) {
		System.out.println(beanName + " beanPostProcess  before");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, final String beanName) {
		System.out.println(beanName + " beanPostProcess  after");
		return bean;
	}
}
