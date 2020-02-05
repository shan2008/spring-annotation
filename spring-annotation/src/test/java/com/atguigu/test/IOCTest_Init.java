package com.atguigu.test;

import com.atguigu.bean.Color;
import com.atguigu.config.MainConfig3;
import com.atguigu.tx.TxConfig;
import com.atguigu.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author syou
 * @date 2019/6/4.
 */
public class IOCTest_Init {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
        Color color=(Color) applicationContext.getBean(Color.class);
        applicationContext.close();
    }

}
