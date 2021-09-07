package com.qzb.ioc.concept.typeconversion;

import com.qzb.ioc.concept.showcode.User;
import com.qzb.ioc.selfwrite.spring.annotation.Component;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;

import java.util.Collections;
import java.util.Set;

/**
 * Spring中提供的类型转换服务，比PropertyEditor功能更强大
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 18:01
 * @since 1.0.0
 **/
@Component
public class StringToUserConverter implements ConditionalGenericConverter {
	
	@Override
	public boolean matches(final TypeDescriptor sourceType, final TypeDescriptor targetType) {
		return sourceType.getType().equals(String.class) && targetType.getType().equals(User.class);
	}
	
	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		return Collections.singleton(new ConvertiblePair(String.class, User.class));
	}
	
	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		String[] split = ((String) source).split(",");
		User user = new User();
		user.setName(split[0]);
		user.setAge(Integer.valueOf(split[1]));
		return user;
	}
	
}
