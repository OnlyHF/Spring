package com.qzb.spring5.bean;

public class Orders {
	private String oname;

	public Orders() {
		System.out.println("第一步：执行无参数构造创建bean实例");
	}

	public void setOname(String oname) {
		System.out.println("第二步：调用set方法设置属性的值");
		this.oname = oname;
	}

	// 创建执行的初始化方法
	public void initMethod() {
		System.out.println("第三步：执行初始化方法");
	}

	// 创建销毁时的方法
	public void destroyMethod() {
		// 第四步在于使用
		System.out.println("第五步：bean实例销毁时执行的方法");
	}
}
