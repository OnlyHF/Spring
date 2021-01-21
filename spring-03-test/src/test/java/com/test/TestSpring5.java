package com.test;

import com.qzb.spring5.User;
import com.qzb.spring5.autowire.Emp;
import com.qzb.spring5.bean.Orders;
import com.qzb.spring5.collectiontype.Student;
import com.qzb.spring5.factorybean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
