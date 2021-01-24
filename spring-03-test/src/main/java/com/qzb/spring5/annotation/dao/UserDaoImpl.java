package com.qzb.spring5.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Override
	public void add() {
		System.out.println("com.qzb.spring5.annotation.dao.UserDaoImpl.add()...");
	}
}
