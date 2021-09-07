package com.qzb.ioc.concept.ordercomparator;

import com.qzb.ioc.concept.showcode.demo.A;
import com.qzb.ioc.concept.showcode.demo.B;
import org.springframework.core.OrderComparator;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:02
 * @since 1.0.0
 **/
public class MainDemo {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		AnnotationAwareOrderComparator orderComparator = new AnnotationAwareOrderComparator();
		System.out.println(orderComparator.compare(a,b));
		
		List list = new ArrayList();
		list.add(a);
		list.add(b);
		list.sort(orderComparator);
		System.out.println(list);
	}
	
}
