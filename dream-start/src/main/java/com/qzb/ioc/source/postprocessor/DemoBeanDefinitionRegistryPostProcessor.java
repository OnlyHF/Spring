package com.qzb.ioc.source.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2022-03-30 16:24
 * @since
 */
@Component
@Order(-2)
public class DemoBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, Ordered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("DemoBeanDefinitionRegistryPostProcessor -> postProcessBeanFactory : " + new Date());
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("DemoBeanDefinitionRegistryPostProcessor -> postProcessBeanDefinitionRegistry: " + new Date());
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
