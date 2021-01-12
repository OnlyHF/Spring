package com.qzb.jdk.object;

public class ObjectDemo {

	public static void main(String[] args) {
		ObjectDemo demo1 = new ObjectDemo();
		ObjectDemo demo2 = new ObjectDemo();
		System.out.println(demo1 == demo2);
		System.out.println(demo1.hashCode());
		System.out.println(demo2.hashCode());
		System.out.println(demo1);
		System.out.println(demo2);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
