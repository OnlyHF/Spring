package com.qzb.spring5.annotation.service;

import com.qzb.spring5.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 在注解里面value属性值可以省略不写
// 默认值是类名称，首字母小写
@Service(value = "userService")
public class UserService {

//	@Autowired
//	@Qualifier("userDaoImpl")
//	private UserDao userDao;

	@Resource(name = "userDaoImpl")
	private UserDao userDao;

	public void add() {
		userDao.add();
		System.out.println("----------------------------------------------");
		System.out.println("com.qzb.spring5.annotation.service.add()....");
	}
}
