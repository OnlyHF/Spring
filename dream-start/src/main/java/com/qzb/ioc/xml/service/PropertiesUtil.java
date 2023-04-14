package com.qzb.ioc.xml.service;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2023-02-22 15:15
 * @since
 */
@Component
public class PropertiesUtil implements EmbeddedValueResolverAware {

	private StringValueResolver stringValueResolver;

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		stringValueResolver = resolver;
	}

	public String getPropertiesValue(String key) {
		StringBuilder name = new StringBuilder("${").append(key).append("}");
		return stringValueResolver.resolveStringValue(name.toString());
	}
}
