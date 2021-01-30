package com.qzb.spring5.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addMoney() {
		String sql = "update t_account set money = money - ? where id = ?";
		Object[] args = {100, "1"};
		jdbcTemplate.update(sql, args);
	}

	@Override
	public void reduceMoney() {
		String sql = "update t_account set money = money + ? where id = ?";
		Object[] args = {100, "2"};
		jdbcTemplate.update(sql, args);
	}
}
