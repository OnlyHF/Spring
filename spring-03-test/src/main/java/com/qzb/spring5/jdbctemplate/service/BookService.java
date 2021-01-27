package com.qzb.spring5.jdbctemplate.service;

import com.qzb.spring5.jdbctemplate.dao.BookDao;
import com.qzb.spring5.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

	// 查询表中的记录数
	public int findCount() {
		return bookDao.selectCount();
	}

	public Book findOne(String bookId) {
		return bookDao.findBookInfo(bookId);
	}

	public List<Book> findAll() {
		return bookDao.findAll();
	}

	// 批量添加
	public void batchAdd(List<Object[]> batchArgs) {
		bookDao.batchAdd(batchArgs);
	}

	// 批量修改
	public void batchUpdate(List<Object[]> batchArgs) {
		bookDao.batchUpdate(batchArgs);
	}

	// 批量删除
	public void batchDelete(List<Object[]> batchArgs) {
		bookDao.batchDelete(batchArgs);
	}

}
