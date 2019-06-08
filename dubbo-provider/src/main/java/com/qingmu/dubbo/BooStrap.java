package com.qingmu.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class BooStrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-server.xml");
        context.start();
        System.in.read();   //按任意键退出
    }
}
