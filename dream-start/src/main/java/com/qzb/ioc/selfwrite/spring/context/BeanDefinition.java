package com.qzb.ioc.selfwrite.spring.context;

import lombok.Data;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-05 15:21
 * @since 1.0.0
 **/
@Data
public class BeanDefinition {
	
	private String beanName;
	
	private Class beanClazz;
	
	private String scope;
	
}
