package com.qzb.ioc.xml.service;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2023-02-22 15:06
 * @since
 */
public class StringToDateConverter implements Converter<String, LocalDateTime> {

	@Override
	public LocalDateTime convert(String source) {
		return LocalDateTime.parse(source);
	}
}
