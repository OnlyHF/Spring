package com.qzb.ioc.construct;

import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-12-06 12:07
 * @since 1.0.0
 **/
@Service
public class DemoAImpl implements IDemo {

	public DemoAImpl() {
		System.out.println("A Construct");
	}

	@Override
	public String getType() {
		return "A";
	}

	@Override
	public void hello() {
		System.out.println("A......");
	}
}
