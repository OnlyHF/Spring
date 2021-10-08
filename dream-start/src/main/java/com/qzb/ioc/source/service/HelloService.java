package com.qzb.ioc.source.service;

import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-12 14:01
 * @since 1.0.0
 **/
@Service
public class HelloService {
	
	public void hello() {
		System.out.println("hello");
	}
	
}
