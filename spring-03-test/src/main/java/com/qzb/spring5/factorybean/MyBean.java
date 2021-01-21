package com.qzb.spring5.factorybean;

import com.qzb.spring5.User;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<User> {

	// 定义返回bean
	@Override
	public User getObject() throws Exception {
		User user = new User();
		return user;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
