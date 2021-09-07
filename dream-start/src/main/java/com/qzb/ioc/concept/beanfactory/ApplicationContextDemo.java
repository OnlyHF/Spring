package com.qzb.ioc.concept.beanfactory;

/**
 * ApplicationContext是个接口，实际上也是BeanFactory，不过比BeanFactory功能更强大；比如：
 * - HierarchicalBeanFactory : 拥有获取父BeanFactory的功能
 * - ListableBeanFactory : 拥有获取beanNames的功能
 * - ResourcePatternResolver : 资源加载器，可以一次性获取过个资源（文件资源等等）
 * - EnvironmentCapable : 可以获取运行时环境（没有设置运行时环境功能）
 * - ApplicationEventPublisher : 拥有广播事件的功能（没有添加事件监听器的功能）
 * - MessageSource : 拥有国际化功能
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 14:00
 * @since 1.0.0
 **/
public class ApplicationContextDemo {


}
