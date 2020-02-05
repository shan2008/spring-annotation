package com.atguigu.bean.cycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Yellow2 implements InitializingBean {

    @Autowired
    public YellowOrange yellowOrange;


    private Yellow2() {
        System.out.println("Yellow创建....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("yellowOrange注入成功了？"+yellowOrange!=null);
    }
}
