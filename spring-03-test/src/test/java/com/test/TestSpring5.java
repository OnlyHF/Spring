package com.test;

import com.qzb.spring5.User;
import com.qzb.spring5.annotation.config.SpringConfig;
import com.qzb.spring5.annotation.service.UserService;
import com.qzb.spring5.aop.xml.Book;
import com.qzb.spring5.autowire.Emp;
import com.qzb.spring5.bean.Orders;
import com.qzb.spring5.collectiontype.Student;
import com.qzb.spring5.factorybean.MyBean;
import com.qzb.spring5.jdbctemplate.service.BookService;
import com.qzb.spring5.transaction.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring5 {

	@org.junit.Test
	public void testAdd() {
		String classpath = "bean1.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		User user = context.getBean("user", User.class);
		user.add();
	}

	@org.junit.Test
	public void testStudent() {
		String classpath = "bean1.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		Student student = context.getBean("student", Student.class);
		student.test();
	}

	@org.junit.Test
	public void test03() {
		String classpath = "bean2.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		User myBean = context.getBean("myBean", User.class);
		System.out.println(myBean);
	}

	@org.junit.Test
	public void test04() {
		String classpath = "bean3.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		Orders orders = context.getBean("orders", Orders.class);
		System.out.println(orders);

		// 手动销毁bean实例
		((ClassPathXmlApplicationContext) context).close();
	}

	@org.junit.Test
	public void test05() {
		String classpath = "bean4.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
	}

	@Test
	public void test06() {
		String classPath = "bean5.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);
		userService.add();
	}

	@Test
	public void test07() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);
		userService.add();
	}

	@Test
	public void test08() {
		String classPath = "bean6.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
		com.qzb.spring5.aop.annotation.User user = context.getBean("user", com.qzb.spring5.aop.annotation.User.class);
//		System.out.println(user);
		user.add();
	}

	@Test
	public void test09() {
		String classPath = "bean7.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
		Book book = context.getBean("book", Book.class);
//		System.out.println(user);
		book.buy();
	}

	@Test
	public void test10() {
		String classPath = "bean8.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
		BookService bookService = context.getBean("bookService", BookService.class);

//		com.qzb.spring5.jdbctemplate.entity.Book book = new com.qzb.spring5.jdbctemplate.entity.Book();
//		book.setBookId("2");
//		book.setBookName("《hello 20210127》");
//		book.setBookStatus("1");
//		bookService.addBook(book);

//		com.qzb.spring5.jdbctemplate.entity.Book book = new com.qzb.spring5.jdbctemplate.entity.Book();
//		book.setBookId("1");
//		book.setBookName("《hello java》");
//		book.setBookStatus("2");
//
//		bookService.updateBook(book);

//		bookService.delete("1");

//		int count = bookService.findCount();
//		System.out.println(count);

//		com.qzb.spring5.jdbctemplate.entity.Book book = bookService.findOne("1");
//		System.out.println(book);

		List<com.qzb.spring5.jdbctemplate.entity.Book> bookList = bookService.findAll();
		System.out.println(bookList);

//		List<Object[]> batchArgs = new ArrayList<>();
//		Object[] o1 = {"3", "name3", "3"};
//		Object[] o2 = {"4", "name5", "4"};
//		Object[] o3 = {"5", "name5", "5"};
//		batchArgs.add(o1);
//		batchArgs.add(o2);
//		batchArgs.add(o3);
//		bookService.batchAdd(batchArgs);

//		List<Object[]> batchArgs = new ArrayList<>();
//		Object[] o1 = {"《数学》", "3", "3"};
//		Object[] o2 = {"《语文》", "4", "4"};
//		Object[] o3 = {"《英语》", "5", "5"};
//		batchArgs.add(o1);
//		batchArgs.add(o2);
//		batchArgs.add(o3);
//		bookService.batchUpdate(batchArgs);

//		List<Object[]> batchArgs = new ArrayList<>();
//		Object[] o1 = {"3"};
//		Object[] o2 = {"4"};
//		batchArgs.add(o1);
//		batchArgs.add(o2);
//		bookService.batchDelete(batchArgs);
	}

	@Test
	public void test11() {
		String classPath = "bean9.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
		AccountService accountService = context.getBean("accountService", AccountService.class);
		accountService.accountMoney();
	}
}
