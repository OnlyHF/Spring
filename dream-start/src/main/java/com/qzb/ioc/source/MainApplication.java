package com.qzb.ioc.source;

import com.qzb.ioc.source.config.AppConfig;
import com.qzb.ioc.source.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-12 14:02
 * @since 1.0.0
 **/
public class MainApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloService helloService = context.getBean("helloService", HelloService.class);
		helloService.hello();
		
		((AnnotationConfigApplicationContext) context).close();
	}
	
}
