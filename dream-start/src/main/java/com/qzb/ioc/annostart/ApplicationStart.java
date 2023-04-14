package com.qzb.ioc.annostart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2023-02-23 15:26
 * @since
 */
public class ApplicationStart {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.qzb.ioc.annostart");
		IOCService iocService = applicationContext.getBean(IOCService.class);
		System.out.println(iocService.hello());
	}

}
