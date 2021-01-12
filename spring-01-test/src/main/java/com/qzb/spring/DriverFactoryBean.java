package com.qzb.spring;

import org.springframework.beans.factory.FactoryBean;

public class DriverFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return null;
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
