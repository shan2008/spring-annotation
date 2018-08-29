package com.atguigu.test;

import com.atguigu.aop.Login;
import com.atguigu.aop.UerLogin;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.aop.MathCalculator;
import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.bean.Red;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.config.MainConifgOfAutowired;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;

public class IOCTest_AOP {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);


        MathCalculator mathCalculator=(MathCalculator)applicationContext.getBean("mathCalculator");
        mathCalculator.div(1,9);

      /*  UerLogin userLogin = (UerLogin) applicationContext.getBean("uerLogin");
        userLogin.userLogin();
        Login login=(Login)userLogin;

        login.enableUserLogin();*/

        applicationContext.close();
    }

}
