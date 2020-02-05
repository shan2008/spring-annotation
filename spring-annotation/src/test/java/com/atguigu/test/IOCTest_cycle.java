package com.atguigu.test;

import com.atguigu.config.MainConfig4;
import com.atguigu.config.MainConfig5;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author syou
 * @date 2019/8/1.
 */
public class IOCTest_Cycle {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig5.class);
    }

}
