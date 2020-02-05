package com.atguigu.aop;

import com.atguigu.bean.Car;
import com.atguigu.bean.RainBow;
import org.springframework.stereotype.Component;

@Component
public class MathCalculator {
	
	public RainBow div(int i,int j){
		System.out.println("MathCalculator div...");
		RainBow rainBow=new RainBow();
		rainBow.setColor("green");

		return rainBow;
	}

}
