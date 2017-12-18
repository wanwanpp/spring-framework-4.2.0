package com.wp.ioc;

import org.springframework.beans.factory.SmartInitializingSingleton;

/**
 * Created by 王萍 on 2017/11/7 0007.
 */
public class ParentOfFoo implements SmartInitializingSingleton {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ApplicationContext预实例化后调用,ParentOfFoo预实例化后被调用，其子类Foo预实例化后也会被调用。
    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("SmartInitializingSingleton接口定义的afterSingletonsInstantiated方法。");
    }
}
