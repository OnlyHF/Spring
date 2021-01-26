package com.qzb.spring5.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 完全注解配置 - 支持AOP
 */
@Configuration
@ComponentScan(basePackages = {"com.qzb.spring5.aop.annotation"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {
}
