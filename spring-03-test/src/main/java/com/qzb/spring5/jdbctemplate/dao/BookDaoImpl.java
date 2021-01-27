package com.qzb.spring5.jdbctemplate.dao;

import com.qzb.spring5.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

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

	// 查询表中的记录数
	@Override
	public int selectCount() {
		String sql = "select count(*) from t_book";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public Book findBookInfo(String bookId) {
		String sql = "select * from t_book where book_id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), bookId);
	}

	@Override
	public List<Book> findAll() {
		String sql = "select * from t_book";
		List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
		return bookList;
	}

	@Override
	public void batchAdd(List<Object[]> batchArgs) {
		String sql = "insert into t_book values(?, ?, ?)";
		int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
		System.out.println(Arrays.toString(ints));
	}

	@Override
	public void batchUpdate(List<Object[]> batchArgs) {
		String sql = "update t_book set book_name = ?, book_status = ? where book_id = ?";
		int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
		System.out.println(Arrays.toString(ints));
	}

	@Override
	public void batchDelete(List<Object[]> batchArgs) {
		String sql = "delete from t_book where book_id = ?";
		int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
		System.out.println(Arrays.toString(ints));
	}
}
