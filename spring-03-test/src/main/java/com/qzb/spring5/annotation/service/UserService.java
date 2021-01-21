package com.qzb.spring5.annotation.service;

import org.springframework.stereotype.Service;

// 在注解里面value属性值可以省略不写
// 默认值是类名称，首字母小写
@Service(value = "userService")
public class UserService {

	public void add() {
		System.out.println("com.qzb.spring5.annotation.service.add()....");
	}
}
