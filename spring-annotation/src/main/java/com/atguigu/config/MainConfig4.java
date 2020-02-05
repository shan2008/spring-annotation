package com.atguigu.config;

import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.bean.Red;
import com.atguigu.condition.MyImportBeanDefinitionRegistrar;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.xml.MyBeanDefinitionRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author syou
 * @date 2019/7/12.
 */
@Configuration
@Import({MyBeanDefinitionRegistry.class})
public class MainConfig4 {

    //@Scope("prototype")
    @Bean(initMethod="init",destroyMethod="detory")
    public Car car(){
        return new Car();
    }

}
