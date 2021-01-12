package com.qzb.jdk.string;

import org.junit.Test;

public class StringTest {

	@Test
	public void test1() throws Exception{
		int i = 12;
		System.out.println(i);
		System.out.println(-1 >>> 16);
		System.out.println( 1 << 16);
		System.out.println(Character.isBmpCodePoint(65536));
		System.out.println(Character.MAX_CODE_POINT+1);
		int[] ii = {65535, 65537};
		String a = new String(ii,0,2);
		System.out.println(a);
		System.out.println(a.length());

		a = "钱竹兵";
		System.out.println(a.getBytes("utf-8"));
		System.out.println(new String(a.getBytes("ISO-8859-1")));

		System.out.println(String.CASE_INSENSITIVE_ORDER.compare("test622", "test122"));
	}

	@Test
	public void regionMatches() {
		String a = "qwer123212321qwer123212321";
		String b = "12321";
		int count = 0;
		for (int i = 0; i <= a.length() - b.length(); i++) {
			if (a.regionMatches(i, b, 0, b.length())) {
				count++;
				i += b.length() - 1;	// 跳过匹配到到一段
			}
		}
		System.out.println(count);
	}

	@Test
	public void testHashCode() {
		String a = "aa";
		System.out.println(a.hashCode());
		System.out.println(Character.MIN_SUPPLEMENTARY_CODE_POINT);
		System.out.println(a.indexOf(12));
	}
}
