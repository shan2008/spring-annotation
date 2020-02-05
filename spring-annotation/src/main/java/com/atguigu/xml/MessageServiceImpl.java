package com.atguigu.xml;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author syou
 * @date 2019/4/11.
 */
public class MessageServiceImpl implements InitializingBean {

    public MessageServiceImpl(){
        System.out.println("MessageServiceImpl构造完成");
    }


    public void setInfo(String info) {
        System.out.println("setInfo...");
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    private String info;

    public void setStudentInfo(StudentInfo studentInfo) {
        System.out.println("studentInfo注入");
        this.studentInfo = studentInfo;
    }

    private StudentInfo studentInfo;


    public String getMessage() {
        return "hello world";
    }


    public void init() {
        System.out.println("init...");
    }

    public void destory() {
        System.out.println("destory...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("info------>"+info);
    }
}



