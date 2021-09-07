package com.qzb.ioc.concept.showcode;

import com.qzb.ioc.concept.typeconversion.StringToUserConverter;
import com.qzb.ioc.concept.typeconversion.StringToUserPropertyEditor;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.convert.ConversionService;

import java.beans.PropertyEditor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-06 22:13
 * @since 1.0.0
 **/
@ComponentScan("com.qzb.ioc.concept.factorybean")
//@Configuration
public class AppConfig {
	
	/**
	 * 国际化配置
	 * @return
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
	
//	/**
//	 * 事件发布器监听器
//	 * @return
//	 */
//	@Bean
//	public ApplicationListener applicationListener() {
//		return new ApplicationListener() {
//			@Override
//			public void onApplicationEvent(final ApplicationEvent event) {
//				System.out.printf("ApplicationListener %s", System.currentTimeMillis());
//				System.out.println();
//				System.out.printf("接受信息: %s", event.getSource());
//			}
//		};
//	}

//	/**
//	 * PropertyEditor 类型转换
//	 * @return
//	 */
//	@Bean
//	public CustomEditorConfigurer customEditorConfigurer() {
//		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
//		Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();
//		propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
//		customEditorConfigurer.setCustomEditors(propertyEditorMap);
//		return customEditorConfigurer;
//	}

//	/**
//	 * Spring提供的类型转换
//	 * @return
//	 */
//	@Bean
//	public ConversionServiceFactoryBean conversionService() {
//		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
//		conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
//		return conversionServiceFactoryBean;
//	}
	
	
}
