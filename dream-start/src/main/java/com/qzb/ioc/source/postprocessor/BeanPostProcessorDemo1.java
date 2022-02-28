package com.qzb.ioc.source.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

/**
 * Ordered接口用来确认执行顺序,值越大，越先执行
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2022-01-25 13:29
 * @since 1.0.0
 **/
@Service
public class BeanPostProcessorDemo1 implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {
		System.out.println("BeanPostProcessorDemo1: postProcessBeforeInitialization : " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
		System.out.println("BeanPostProcessorDemo1: postProcessAfterInitialization : " + beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		return 4;
	}
}
