package com.qzb.spring5.jdbctemplate.dao;

import com.qzb.spring5.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

	// 注入JdbcTemplate
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Book book) {
		String sql = "insert into t_book values(?, ?, ?)";
		Object[] args = { book.getBookId(), book.getBookName(), book.getBookStatus() };
		int update = jdbcTemplate.update(sql, args);
		System.out.println(update);
	}

	@Override
	public void update(Book book) {
		String sql = "update t_book set book_name = ?, book_status = ? where book_id = ?";
		Object[] args = {book.getBookName(), book.getBookStatus(), book.getBookId()};
		int update = jdbcTemplate.update(sql, args);
		System.out.println(update);
	}

	@Override
	public void delete(String bookId) {
		String sql = "delete from t_book where book_id = ?";
		int update = jdbcTemplate.update(sql, bookId);
		System.out.println(update);
	}
}
