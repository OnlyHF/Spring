package com.qzb.jdk.object;

public class testPerson {

	public static void main(String[] args) {
		Person p = new ManPerson();
		System.out.println(p.getClass());
		System.out.println(Person.class);
	}
}
