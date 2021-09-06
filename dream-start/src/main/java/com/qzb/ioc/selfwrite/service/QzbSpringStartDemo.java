package com.qzb.ioc.selfwrite.service;

import com.qzb.ioc.selfwrite.service.bean.LoginService;
import com.qzb.ioc.selfwrite.service.bean.UserService;
import com.qzb.ioc.selfwrite.spring.annotation.ComponentScan;
import com.qzb.ioc.selfwrite.spring.context.QzbConfigApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-04 22:31
 * @since 1.0.0
 **/
@ComponentScan("com.qzb.ioc.selfwrite.service")
public class QzbSpringStartDemo {
	
	public static void main(String[] args) {
		QzbConfigApplicationContext applicationContext = new QzbConfigApplicationContext(QzbSpringStartDemo.class);

		UserService userService = (UserService)applicationContext.getBean("userService");
		
//		userService.test();
		
		System.out.println(userService.getBeanName());
//
//		System.out.println(userService);
		
//		LoginService loginService = (LoginService)applicationContext.getBean("loginService");
//		loginService.login();
	}
	
}
