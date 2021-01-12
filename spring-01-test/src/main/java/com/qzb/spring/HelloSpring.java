package com.qzb.spring;

public class HelloSpring {

	private String name;
	private int sex;

	public HelloSpring () {

	}

	public HelloSpring(String name, int sex) {
		this.name = name;
		this.sex = sex;
	}

	public static HelloSpring build() {
		return new HelloSpring();
	}
}
