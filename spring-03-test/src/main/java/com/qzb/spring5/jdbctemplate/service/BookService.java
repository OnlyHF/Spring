package com.qzb.spring5.jdbctemplate.service;

import com.qzb.spring5.jdbctemplate.dao.BookDao;
import com.qzb.spring5.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;

	public void addBook(Book book) {
		bookDao.add(book);
	}

	public void updateBook(Book book) {
		bookDao.update(book);
	}

	public void delete(String bookId) {
		bookDao.delete(bookId);
	}
}
