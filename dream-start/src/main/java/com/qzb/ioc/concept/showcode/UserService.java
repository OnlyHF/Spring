package com.qzb.ioc.concept.showcode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-06 22:15
 * @since 1.0.0
 **/
@Service
public class UserService {
	
//	@Value("张三,19")
	private User user;
	
	public void hello() {
		System.out.println("hello world");
	}
	
	public void initMethod() {
		System.out.println("hello, i am init method");
	}
	
	public void printUser() {
		System.out.println(user);
	}
}
