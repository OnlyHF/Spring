package com.qzb.spring.ioc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Resource(name = "personDemo")
	private PersonDemo personDemo;

	@Override
	public void hello() {
		personDemo.hello();
		System.out.println("personServiceImpl hello()");
	}
}
