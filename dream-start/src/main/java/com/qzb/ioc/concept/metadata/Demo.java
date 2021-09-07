package com.qzb.ioc.concept.metadata;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

/**
 * MetadataReader表示类的元数据读取器，默认实现类为SimpleMetadataReader
 *
 * 需要注意的是，SimpleMetadataReader去解析类时，使用的ASM技术
 *
 * 为什么要使用ASM技术，Spring启动的时候需要去扫描，如果指定的包路径比较宽泛，那么扫描的类是非常多的，那如果在Spring启动时就把这些类全部加载进JVM了，这样不太好，所以使用了ASM技术。
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 23:15
 * @since 1.0.0
 **/
public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		SimpleMetadataReaderFactory simpleMetadataReaderFactory = new SimpleMetadataReaderFactory();
		
		// 构造一个MetadataReader
		MetadataReader metadataReader = simpleMetadataReaderFactory.getMetadataReader("com.qzb.ioc.concept.showcode.UserService");
		
		// 得到一个ClassMetadata，并获取了类名
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		
		System.out.println(classMetadata.getClassName());
		
		// 获取一个AnnotationMetadata，并获取类上的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		for (String annotationType : annotationMetadata.getAnnotationTypes()) {
			System.out.println(annotationType);
		}
		
	}
	
}
