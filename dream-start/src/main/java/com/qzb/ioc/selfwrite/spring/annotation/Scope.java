package com.qzb.ioc.selfwrite.spring.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-05 15:22
 * @since 1.0.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Scope {
	
	String value() default "singleton";
	
}
