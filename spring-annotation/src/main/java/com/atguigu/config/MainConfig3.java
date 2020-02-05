package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.ServiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author syou
 * @date 2019/6/4.
 */
@Configuration
public class MainConfig3 {

    @Bean
    public ServiceBean serviceBean() {
        return new ServiceBean();
    }

    @Bean
    public Color color() {
        return new Color();
    }
}
