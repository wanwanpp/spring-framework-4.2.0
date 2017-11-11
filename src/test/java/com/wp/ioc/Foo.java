package com.wp.ioc;

import org.springframework.beans.factory.InitializingBean;

public class Foo extends ParentOfFoo implements InitializingBean {

    public void execute() {

        System.out.println("foo execute");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("进入initializingBean接口定义的方法。");
    }
}