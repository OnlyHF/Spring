package com.qzb.spring5.aop;

public class UserDaoImpl implements UserDao {
	@Override
	public int add(int a, int b) {
		System.out.println("com.qzb.spring5.aop.UserDaoImpl.add() 方法被执行了");
		return a + b;
	}

	@Override
	public String update(String id) {
		System.out.println("com.qzb.spring5.aop.UserDaoImpl.update() 方法被执行了");
		return id;
	}
}
