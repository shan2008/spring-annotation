package com.atguigu.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author syou
 * @date 2019/7/10.
 */
public class MyBeanPostProcessor  implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization....."+beanName);
        if(bean instanceof MessageServiceImpl){
            MessageServiceImpl service = (MessageServiceImpl)bean;
            System.out.println(service.getInfo());
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization....."+beanName);
        return bean;
    }
}
