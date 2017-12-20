package com.wp.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 王萍
 * @date 2017/12/20 0020
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\wp\\annotation\\annotation.xml");
        AnimalService animalService = (AnimalService) applicationContext.getBean("animalService");
        Map map = animalService.getAllAnimalsWithCount();

        List animals = (ArrayList) map.get("animals");
        int count = (int) map.get("count");
        System.out.println(count);
        System.out.println(animals);
    }
}
