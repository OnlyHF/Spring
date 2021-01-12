package com.qzb.beans.test;

import com.qzb.beans.MyTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyTestBean myTestBean = (MyTestBean) ac.getBean("myTestBean");
		System.out.println(myTestBean);
	}


}
