package com.qzb.spring5.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

	public static void main(String[] args) {
		// 创建接口实现类代理对象
		Class[] interfaces = new Class[]{UserDao.class};
		UserDao userDao = new UserDaoImpl();
		UserDao proxy = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
		int result = proxy.add(1, 3);
		System.out.println(result);
	}

}

// 创建代理对象代码
class UserDaoProxy implements InvocationHandler {

	private Object obj;

	public UserDaoProxy(Object obj) {
		this.obj = obj;
	}

	// 增强的逻辑
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法之前执行。。。。" + method.getName() + " ，传入的参数为：" + Arrays.toString(args));
		Object resultObj = method.invoke(obj, args);
		System.out.println("方法之后执行。。。。。。");
		return resultObj;
	}
}
