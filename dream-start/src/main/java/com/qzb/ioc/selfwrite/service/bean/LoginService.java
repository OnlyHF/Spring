package com.qzb.ioc.selfwrite.service.bean;

import com.qzb.ioc.selfwrite.spring.annotation.Component;
import com.qzb.ioc.selfwrite.spring.annotation.Scope;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-04 22:28
 * @since 1.0.0
 **/
@Component
@Scope("prototype")
public class LoginService {
	
	public void login() {
		System.out.println("hello login");
	}
}
