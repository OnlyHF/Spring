package com.qzb.ioc.xml.service;

import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2023-02-22 15:33
 * @since
 */
public class QzbSmartInitializingSingleton implements SmartInitializingSingleton {

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("hello : SmartInitializingSingleton");
	}
}
