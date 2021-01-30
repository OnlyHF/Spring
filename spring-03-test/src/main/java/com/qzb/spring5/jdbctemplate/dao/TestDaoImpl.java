package com.qzb.spring5.jdbctemplate.dao;

import com.qzb.spring5.jdbctemplate.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Test test) {
		String sql = "insert into test values(?, ?)";
		Object[] args = {test.getId(), test.getNum()};
		jdbcTemplate.update(sql, args);
	}
}
