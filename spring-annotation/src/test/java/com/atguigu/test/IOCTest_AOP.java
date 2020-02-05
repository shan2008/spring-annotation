package com.atguigu.test;

import com.atguigu.aop.Login;
import com.atguigu.aop.UerLogin;
import com.atguigu.bean.*;
import org.junit.Test;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.config.MainConifgOfAutowired;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;

public class IOCTest_AOP {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);


        MathCalculator mathCalculator = (MathCalculator) applicationContext.getBean("mathCalculator");
        RainBow re = mathCalculator.div(1, 9);
        System.out.println(re.getColor());

      /*  UerLogin userLogin = (UerLogin) applicationContext.getBean("uerLogin");
        userLogin.userLogin();
        Login login=(Login)userLogin;

        login.enableUserLogin();*/

        applicationContext.close();
    }

}
