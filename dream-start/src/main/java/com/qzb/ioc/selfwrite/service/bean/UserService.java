package com.qzb.ioc.selfwrite.service.bean;

import com.qzb.ioc.selfwrite.spring.annotation.Component;
import com.qzb.ioc.selfwrite.spring.annotation.Scope;
import com.qzb.ioc.selfwrite.spring.annotation.Value;
import com.qzb.ioc.selfwrite.spring.context.BeanNameAware;
import com.qzb.ioc.selfwrite.spring.context.InitializingBean;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-04 22:28
 * @since 1.0.0
 **/
@Component("userService")
@Scope
public class UserService implements InitializingBean, BeanNameAware {
	
	@Value("qzb")
	private String username;
	
	@Value("男")
	private String sex;
	
	private String beanName;
	
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	
	public void test() {
		System.out.println("hello spring");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("userService initializingBean");
	}
	
	@Override
	public String toString() {
		return "UserService{" + "username='" + username + '\'' + ", sex='" + sex + '\'' + '}';
	}
	
	public String getBeanName() {
		return beanName;
	}
}
