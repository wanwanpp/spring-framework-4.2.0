package com.wp.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王萍
 * @date 2017/12/22 0022
 */
public class TestTransaction {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\wp\\transaction\\transaction.xml");
        BookShopService service =(BookShopService) applicationContext.getBean("bookShopService");
        service.purchase("wangp","123");
    }
}
