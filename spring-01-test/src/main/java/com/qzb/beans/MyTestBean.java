package com.qzb.beans;

public class MyTestBean {

	private String name;

	public MyTestBean() {
	}

	public MyTestBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
