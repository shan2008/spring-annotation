package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author syou
 * @date 2019/6/4.
 */
public class ServiceBean implements InitializingBean, ApplicationContextAware, ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext...1....start");
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        System.out.println("setApplicationContext.......end");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        System.out.println("onApplicationEvent...3....start");
        System.out.println("onApplicationEvent.......end");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("afterPropertiesSet...2....start");
        System.out.println("afterPropertiesSet.......end");
    }
}
