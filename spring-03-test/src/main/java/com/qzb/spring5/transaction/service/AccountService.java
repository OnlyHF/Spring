package com.qzb.spring5.transaction.service;

import com.qzb.spring5.transaction.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

	@Autowired
	private AccountDao accountDao;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
	public void accountMoney() {
		accountDao.reduceMoney();
		accountDao.addMoney();
		System.out.println("success");
	}

}
