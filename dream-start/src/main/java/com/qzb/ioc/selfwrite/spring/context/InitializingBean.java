package com.qzb.ioc.selfwrite.spring.context;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-05 16:55
 * @since 1.0.0
 **/
public interface InitializingBean {
	
	void afterPropertiesSet() throws Exception;
	
}
