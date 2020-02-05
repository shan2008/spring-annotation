package com.atguigu.xml;

import com.atguigu.bean.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author syou
 * @date 2019/7/12.
 */

// 不支持xml 配置
public class MyBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("cat",new RootBeanDefinition(Cat.class));
        System.out.println("registerBeanDefinitions... 注入cat");
    }
}
