package com.wp.debugSpring;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class TestFoo {

    @Test
    public void testExecute() {

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/wp/debugSpring/testbean.xml"));
//        Foo bean = (Foo) factory.getBean("foo");
//        bean.execute();

        ClassPathResource resource = new ClassPathResource("com/wp/debugSpring/testbean.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

//        String[] beanDefinitionNames = factory.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
//
//        Foo bean = (Foo) factory.getBean("foo");
//        bean.execute();
    }
}
