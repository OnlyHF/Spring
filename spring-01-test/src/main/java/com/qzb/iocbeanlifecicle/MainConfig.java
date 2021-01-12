package com.qzb.iocbeanlifecicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * add by qianzb 20200406 15:30
 */
@Configuration
@ComponentScan(basePackages = {"com.qzb.iocbeanlifecicle"})
public class MainConfig {

	@Bean(initMethod = "initPerson")
	public Person person() {
		Person person = new Person();
		person.setName("张三");
		person.setSex("男");
		return person;
	}
}
