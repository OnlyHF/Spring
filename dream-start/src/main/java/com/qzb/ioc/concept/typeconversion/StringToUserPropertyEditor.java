package com.qzb.ioc.concept.typeconversion;

import com.qzb.ioc.concept.showcode.User;

import java.beans.PropertyEditorSupport;

/**
 * JDK中提供的类型转换工具类
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2021-09-07 16:52
 * @since 1.0.0
 **/
public class StringToUserPropertyEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split(",");
		User user = new User();
		user.setName(split[0]);
		user.setAge(Integer.valueOf(split[1]));
		super.setValue(user);
	}
}
