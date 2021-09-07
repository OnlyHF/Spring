package com.qzb.ioc.concept.filter;

import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * 比如以下配置，就算UserService类上没有@Component注解，它也会被扫描成为一个Bean
 *
 * FilterType分为：
 *  - ANNOTATION：表示是否包含某个注解
 *  - ASSIGNABLE_TYPE：表示是否是某个类
 *  - ASPECTJ：表示否是符合某个Aspectj表达式
 *  - REGEX：表示是否符合某个正则表达式
 *  - CUSTOM：自定义
 *
 *
 * 在Spring的扫描逻辑中，默认会添加一个AnnotationTypeFilter给includeFilters，表示默认情况下Spring扫描过程中会认为类上有@Component注解的就是Bean
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:47
 * @since 1.0.0
 **/
@ComponentScan(value = "com.qzb.ioc.concept.showcode",
		includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = UserService.class)}
)
public class IncludeFilterConfig {

}
