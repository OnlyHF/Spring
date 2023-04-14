//package com.qzb.ioc.source.config;
//
//import org.apache.commons.lang3.concurrent.BasicThreadFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.event.ApplicationEventMulticaster;
//import org.springframework.context.event.SimpleApplicationEventMulticaster;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import static org.springframework.context.support.AbstractApplicationContext.APPLICATION_EVENT_MULTICASTER_BEAN_NAME;
//
///**
// * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
// * @date 2021-09-12 14:01
// * @since 1.0.0
// **/
//@ComponentScan("com.qzb.ioc.source")
//@Configuration
//public class AppConfig {
//
//	/**
//	 * 手动配置SimpleApplicationEventMulticaster并设置setTaskExecutor，则事件发布默认为异步.
//	 *
//	 * @param taskExecutor
//	 * @return
//	 */
//	@Bean(APPLICATION_EVENT_MULTICASTER_BEAN_NAME)
//	@Primary
//	public SimpleApplicationEventMulticaster simpleApplicationEventMulticaster(@Qualifier("taskExecutor") ThreadPoolTaskExecutor taskExecutor) {
//		SimpleApplicationEventMulticaster simpleApplicationEventMulticaster = new SimpleApplicationEventMulticaster();
//		simpleApplicationEventMulticaster.setTaskExecutor(taskExecutor);
//		System.out.println("simpleApplicationEventMulticaster : " + simpleApplicationEventMulticaster);
//		return simpleApplicationEventMulticaster;
//	}
//
//	@Bean
//	public ThreadPoolTaskExecutor taskExecutor() {
//		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//		threadPoolTaskExecutor.setBeanName("taskExecutor");
//		threadPoolTaskExecutor.setThreadFactory(new BasicThreadFactory.Builder().namingPattern(String.join("-", "mixapi-async", "%s")).build());
//		threadPoolTaskExecutor.setAllowCoreThreadTimeOut(true);
//		threadPoolTaskExecutor.setCorePoolSize(Runtime.getRuntime().availableProcessors() * 2);
//		threadPoolTaskExecutor.setMaxPoolSize(Runtime.getRuntime().availableProcessors() * 2);
//		threadPoolTaskExecutor.setDaemon(true);
//		return threadPoolTaskExecutor;
//	}
//
//	@Bean
//	public SimpleApplicationEventMulticaster simpleApplicationEventMulticasterTwo(@Qualifier("taskExecutor") ThreadPoolTaskExecutor taskExecutor) {
//		SimpleApplicationEventMulticaster simpleApplicationEventMulticaster = new SimpleApplicationEventMulticaster();
//		simpleApplicationEventMulticaster.setTaskExecutor(taskExecutor);
//		System.out.println("simpleApplicationEventMulticasterTwo : " + simpleApplicationEventMulticaster);
//		return simpleApplicationEventMulticaster;
//	}
//
//}
