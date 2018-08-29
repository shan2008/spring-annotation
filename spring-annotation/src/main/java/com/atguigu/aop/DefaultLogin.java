package com.atguigu.aop;

import org.springframework.stereotype.Component;

/**
 * @author syou
 * @date 2018/8/19.
 */
@Component
public class DefaultLogin implements Login {
    @Override
    public void enableUserLogin() {
        System.out.println("登陆拦截....");
    }
}
