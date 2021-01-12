package com.qzb.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("personAction")
public class PersonAction {

	@Autowired
	private PersonService personService;

	public void hello() {
		personService.hello();
		System.out.println("PersonAction hello()");
	}
}
