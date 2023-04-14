package com.qzb.ioc.xml.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2023-02-21 22:43
 * @since
 */
public class StartApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application_ioc.xml");
		IOCService iocService = applicationContext.getBean(IOCService.class);
		System.out.println(iocService.hello());
	}

}
