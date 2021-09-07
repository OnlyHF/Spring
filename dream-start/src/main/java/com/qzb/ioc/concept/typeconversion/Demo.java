package com.qzb.ioc.concept.typeconversion;

import com.qzb.ioc.concept.showcode.AppConfig;
import com.qzb.ioc.concept.showcode.User;
import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 16:46
 * @since 1.0.0
 **/
public class Demo {
	
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new StringToUserConverter());
//		User user = conversionService.convert("你好,123", User.class);
//		System.out.println(user);
		
		
		/**
		 * TypeConverter 整合了PropertyEditor 和 ConversionService的功能，是Spring内部使用
		 */
		SimpleTypeConverter typeConverter = new SimpleTypeConverter();
//		typeConverter.registerCustomEditor(User.class, new StringToUserPropertyEditor());
		typeConverter.setConversionService(conversionService);
		
		User user = typeConverter.convertIfNecessary("你好,21", User.class);
		System.out.println(user);
		
		
//		UserService userService = context.getBean("userService", UserService.class);
//
//		userService.printUser();
		
		
	}
	
}
