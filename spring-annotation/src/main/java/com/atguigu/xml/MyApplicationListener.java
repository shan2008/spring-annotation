package com.atguigu.xml;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author syou
 * @date 2019/7/11.
 */
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
     //   System.out.println("MyApplicationListener....event");
    }
}
