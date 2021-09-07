package com.qzb.ioc.concept.filter;

import com.qzb.ioc.concept.showcode.User;
import com.qzb.ioc.concept.showcode.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * ExcludeFilter表示排除过滤器
 *
 * 如下配置，表示扫描com.qzb.ioc.concept.showcode包下面的所有类，但是排除UserService类，就算有@ComponentScan注解也不会成为Bean
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 22:46
 * @since 1.0.0
 **/
@ComponentScan(value = "com.qzb.ioc.concept.showcode",
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = UserService.class)}
)
public class ExcludeFilterConfig {

}
