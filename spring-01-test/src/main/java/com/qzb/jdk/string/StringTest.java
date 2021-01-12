package com.qzb.jdk.string;

/**
 * created by qianzb 20200423
 */
public class StringTest {

	public static void main(String[] args) {
		new StringTest().testString4();
	}

	public void testString() {
		String a = "";
		String b = new String();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a == b);
	}

	public void testString2() {
		String a = "123";
		String b = new String(a);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a = b+ "4";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

	public void testString3() {
		char[] a = {'1', '2', '3'};
		String b = new String(a);
		System.out.println(b);
		a[2] = '4';
		System.out.println(a);
		System.out.println(b);
	}

	public void testString4() {
		char[] c = {'a', 'b', 'c'};
		String a = new String(c, 1, 2);
		System.out.println(a);
	}
}
