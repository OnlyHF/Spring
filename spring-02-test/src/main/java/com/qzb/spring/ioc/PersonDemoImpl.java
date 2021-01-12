package com.qzb.spring.ioc;

import org.springframework.stereotype.Repository;

@Repository("personDemo")
public class PersonDemoImpl implements PersonDemo {
	@Override
	public void hello() {
		System.out.println("PersonDemoImpl hello()");
	}
}
