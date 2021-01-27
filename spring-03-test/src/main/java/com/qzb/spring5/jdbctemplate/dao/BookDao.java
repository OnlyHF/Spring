package com.qzb.spring5.jdbctemplate.dao;

import com.qzb.spring5.jdbctemplate.entity.Book;

import java.util.List;

public interface BookDao {

	void add(Book book);

	void update(Book book);

	void delete(String bookId);

	int selectCount();

	Book findBookInfo(String bookId);

	List<Book> findAll();

	void batchAdd(List<Object[]> batchArgs);

	void batchUpdate(List<Object[]> batchArgs);

	void batchDelete(List<Object[]> batchArgs);
}
