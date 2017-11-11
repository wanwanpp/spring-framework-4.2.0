package com.wp.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王萍 on 2017/11/11 0011.
 */
public class TestAop {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/wp/aop/aop.xml");
        InvokableMethod defaultInvokeMethod = (InvokableMethod) applicationContext.getBean("defaultInvokeMethod");
        defaultInvokeMethod.invokeMethod();
    }
}
