package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Cat cat;
	
	public Car(){
		System.out.println("car constructor..."+"cat=注入成功了吗"+cat!=null);
	}
	
	public void init(){
		System.out.println("car ... init...");
	}
	
	public void detory(){
		System.out.println("car ... detory...");
	}

}
