package com.atguigu.aop;

import org.springframework.stereotype.Component;

/**
 * @author syou
 * @date 2018/8/19.
 */
@Component
public class UerLogin {

    public  void userLogin(){
        System.out.println("用户登陆...");
    }
}
