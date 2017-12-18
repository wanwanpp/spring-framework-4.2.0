package com.wp.ioc;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestFoo {

    @Test
    public void testExecute() {

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/wp/debugSpring/testbean.xml"));
//        Foo bean = (Foo) factory.getBean("foo");
//        bean.execute();

        ClassPathResource resource = new ClassPathResource("com\\wp\\ioc\\testbean.xml");
//        ClassPathResource resource = new ClassPathResource("com/wp/debugSpring/testbean.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

//        打印当前ioc中所有的BeanDefinition
//        String[] beanDefinitionNames = factory.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);

//        ApplicationContext可以自动识别BeanPostProcessor,BeanFactory需要手动添加
//        factory.addBeanPostProcessor((BeanPostProcessor) factory.getBean("myInstantiationAwareBeanPostProcessor"));
//        factory.addBeanPostProcessor((BeanPostProcessor) factory.getBean("helloBeanPostProcessor"));
        Foo bean = (Foo) factory.getBean("foo");
        bean.execute();
    }

    @Test
    public void testApplicationContext() {
        //ClassPathXmlApplicationContext的构造函数测参数configLocation可以有多个。即指定多个配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\wp\\ioc\\testbean.xml", "com\\wp\\ioc\\testbean.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\wp\\ioc\\testbean.xml");
        Foo foo = (Foo) applicationContext.getBean("wanwanpp");
        foo.execute();
    }
}
