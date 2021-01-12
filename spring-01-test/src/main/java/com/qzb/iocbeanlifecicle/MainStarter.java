package com.qzb.iocbeanlifecicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * add by qianzb 20200406 15:33
 */
public class MainStarter {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = (Person)ac.getBean("person");
		System.out.println(person);
	}

}
