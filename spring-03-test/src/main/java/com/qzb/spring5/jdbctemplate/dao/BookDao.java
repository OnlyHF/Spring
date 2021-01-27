package com.qzb.spring5.jdbctemplate.dao;

import com.qzb.spring5.jdbctemplate.entity.Book;

public interface BookDao {

	void add(Book book);

	void update(Book book);

	void delete(String bookId);
}
