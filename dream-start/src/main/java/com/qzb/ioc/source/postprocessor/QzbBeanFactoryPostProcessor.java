package com.qzb.ioc.source.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2022-03-31 11:02
 * @since
 */
@Component
public class QzbBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("QzbBeanFactoryPostProcessor -> postProcessBeanFactory : " + new Date());
	}
}
