package com.wp.ioc;

import org.springframework.beans.factory.InitializingBean;

public class Foo extends ParentOfFoo implements InitializingBean {

    private int age;

    public int getAge() {
        return age;
    }

    //必须要有setter方法，spring会调用setter完成属性的注入。
    public void setAge(int age) {
        this.age = age;
    }

    public void execute() {

        System.out.println(this.getAge());
        System.out.println(this.getName());

        System.out.println("foo execute");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("进入initializingBean接口定义的方法。");
    }
}