package com.atguigu.bean.cycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author syou
 * @date 2019/8/1.
 */
@Component
public class YellowOrange implements InitializingBean {
    @Autowired
    private Yellow2 yellow;

    public YellowOrange(){
        System.out.println("YellowOrange创建");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("yellow被注入成功了？"+yellow!=null);
    }
}
