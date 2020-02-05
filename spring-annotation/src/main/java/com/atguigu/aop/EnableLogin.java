package com.atguigu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author syou
 * @date 2018/8/19.
 */
//@Aspect
//@Component
public class EnableLogin {

    @DeclareParents(value = "com.atguigu.aop.UerLogin+", defaultImpl = DefaultLogin.class)
    public static Login login;
}
