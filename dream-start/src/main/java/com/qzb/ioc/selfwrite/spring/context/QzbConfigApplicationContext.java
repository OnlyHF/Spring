package com.qzb.ioc.selfwrite.spring.context;

import com.qzb.ioc.selfwrite.spring.annotation.Component;
import com.qzb.ioc.selfwrite.spring.annotation.ComponentScan;
import com.qzb.ioc.selfwrite.spring.annotation.Scope;
import com.qzb.ioc.selfwrite.spring.annotation.Value;

import java.beans.Introspector;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-04 22:24
 * @since 1.0.0
 **/
public class QzbConfigApplicationContext {
	
	private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
	
	private Map<String, Object> singletonMap = new ConcurrentHashMap<>();
	
	private List<BeanPostProcessor> beanPostProcessorList = new LinkedList<>();
	
	/**
	 * 创建容器
	 * @param clazz
	 */
	public QzbConfigApplicationContext(Class clazz) {
		boolean containComponentScan = clazz.isAnnotationPresent(ComponentScan.class);
		if (containComponentScan) {
			ComponentScan componentScanClazz = (ComponentScan)clazz.getAnnotation(ComponentScan.class);
			String path = componentScanClazz.value();
			path = path.replaceAll("\\.", File.separator);
			
			String projectPath = clazz.getResource("").getPath();
			projectPath = projectPath.substring(0, projectPath.indexOf("com"));

			path = projectPath + path;
			loadBeanPostProcessClass(new File(path), clazz, projectPath);
			loadClass(new File(path), clazz, projectPath);
		}
		
	}
	
	private void loadBeanPostProcessClass(File file, Class clazz, String projectPath) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile() && f.getName().endsWith(".class")) {
				String className = f.getAbsolutePath();
				className = className.substring(projectPath.length(), className.indexOf(".class")).replaceAll(File.separator, "\\.");
				Class loadClazz = null;
				try {
					loadClazz = clazz.getClassLoader().loadClass(className);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				if (loadClazz.isAnnotationPresent(Component.class)) {
					if (BeanPostProcessor.class.isAssignableFrom(loadClazz)) {
						try {
							BeanPostProcessor instance = (BeanPostProcessor) loadClazz.getConstructor().newInstance();
							beanPostProcessorList.add(instance);
							continue;
						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							e.printStackTrace();
						} catch (NoSuchMethodException e) {
							e.printStackTrace();
						}
					}
				}
			} else if (f.isDirectory()) {
				loadBeanPostProcessClass(f, clazz, projectPath);
			}
		}
	}
	
	private void loadClass(File file, Class clazz, String projectPath) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile() && f.getName().endsWith(".class")) {
				try {
					String className = f.getAbsolutePath();
					className = className.substring(projectPath.length(), className.indexOf(".class")).replaceAll(File.separator, "\\.");
					Class loadClazz = clazz.getClassLoader().loadClass(className);
					if (loadClazz.isAnnotationPresent(Component.class)) {
						if (BeanPostProcessor.class.isAssignableFrom(loadClazz)) {
							continue;
						}
						
						BeanDefinition beanDefinition = new BeanDefinition();
						
						String beanName = ((Component)loadClazz.getAnnotation(Component.class)).value();
						if ("".equals(beanName)) {
							beanName = Introspector.decapitalize(loadClazz.getSimpleName());
						}
						
						String scope = "singleton";
						if (loadClazz.isAnnotationPresent(Scope.class)) {
							scope = ((Scope)loadClazz.getAnnotation(Scope.class)).value();
						}
						
						beanDefinition.setBeanName(beanName);
						beanDefinition.setBeanClazz(loadClazz);
						beanDefinition.setScope(scope);
						
						beanDefinitionMap.put(beanName, beanDefinition);
						
						if ("singleton".equals(scope)) {
							createBean(beanName, beanDefinition);
						}
						
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} else if (f.isDirectory()) {
				loadClass(f, clazz, projectPath);
			}
		}
	}

	private Object createBean(String beanName, BeanDefinition beanDefinition) {
		Class beanClazz = beanDefinition.getBeanClazz();
		Object obj = null;
		try {
			obj = beanClazz.getConstructor().newInstance();
			singletonMap.put(beanName, obj);
			
			Field[] fileds = beanClazz.getDeclaredFields();
			for (Field filed : fileds) {
				if (filed.isAnnotationPresent(Value.class)) {
					try {
						String value = filed.getAnnotation(Value.class).value();
						filed.setAccessible(true);
						filed.set(obj, value);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
			
			for (BeanPostProcessor beanPostProcessor : beanPostProcessorList) {
				beanPostProcessor.postProcessBeforeInitialization(obj, beanName);
			}
			
			if (BeanNameAware.class.isAssignableFrom(beanClazz)) {
				((BeanNameAware)obj).setBeanName(beanName);
			}
			
			if (obj instanceof InitializingBean) {
				try {
					((InitializingBean)obj).afterPropertiesSet();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			for (BeanPostProcessor beanPostProcessor : beanPostProcessorList) {
				beanPostProcessor.postProcessAfterInitialization(obj, beanName);
			}
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	/**
	 * 获取容器
	 * @param beanName
	 * @return
	 */
	public Object getBean(String beanName) {
		if (!beanDefinitionMap.containsKey(beanName)) {
			throw new NullPointerException(beanName + "不存在");
		}
		Object obj = singletonMap.get(beanName);
		if (Objects.isNull(obj)) {
			obj = createBean(beanName, beanDefinitionMap.get(beanName));
		}
		return obj;
	}
	
}
