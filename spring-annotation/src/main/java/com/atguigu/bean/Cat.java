package com.atguigu.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean,DisposableBean {

	@Value(value = "shan")
	private String catName;
	public Cat(){
		System.out.println("cat constructor...1");
	}



	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat...destroy...4");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cat...afterPropertiesSet...3");
	}

}
