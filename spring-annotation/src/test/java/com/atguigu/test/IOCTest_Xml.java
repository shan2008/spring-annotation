package com.atguigu.test;

import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig4;
import com.atguigu.xml.MessageService;
import com.atguigu.xml.MessageServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author syou
 * @date 2019/4/11.
 */
public class IOCTest_Xml {

    @Test
    public void test1() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);
        System.out.println("***********************");
        applicationContext.close();


    }

}
