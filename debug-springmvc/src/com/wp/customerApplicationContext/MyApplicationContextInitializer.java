package com.wp.customerApplicationContext;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<XmlWebApplicationContext> {
  
    public void initialize(XmlWebApplicationContext applicationContext) {  
        System.out.println("在刷新容器前可以配置容器 全局");  
    }

//    @Override
//    public void initialize(ConfigurableApplicationContext applicationContext) {
//
//    }
}