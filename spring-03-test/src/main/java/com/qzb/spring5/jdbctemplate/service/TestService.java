package com.qzb.spring5.jdbctemplate.service;

import com.qzb.spring5.jdbctemplate.dao.TestDao;
import com.qzb.spring5.jdbctemplate.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	private TestDao testDao;

	public void add() {
		Test test = new Test();
		for(int i = 0; i < 100000; i++) {
			test.setId(i);
			test.setNum(i);
			testDao.add(test);
		}
	}
}
