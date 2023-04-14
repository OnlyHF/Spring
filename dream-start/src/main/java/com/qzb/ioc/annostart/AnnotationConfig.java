package com.qzb.ioc.annostart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2023-02-23 15:24
 * @since
 */
@Configuration
public class AnnotationConfig {

	@Bean
	public IOCService iocService() {
		return new IOCServiceImpl();
	}

}
