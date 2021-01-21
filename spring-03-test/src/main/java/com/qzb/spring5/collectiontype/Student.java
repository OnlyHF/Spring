package com.qzb.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	// 数组类型属性
	private String[] courses;

	private List<String> list;

	private Map<String, String> map;

	private Set<String> set;

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void test() {
		System.out.println(Arrays.toString(courses));
		System.out.println(list);
		System.out.println(map);
		System.out.println(set);
	}
}
