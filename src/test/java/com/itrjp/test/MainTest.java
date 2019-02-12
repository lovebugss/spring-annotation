package com.itrjp.test;

import com.itrjp.bean.Color;
import com.itrjp.config.AnnotationConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class MainTest {
    ApplicationContext applicationContext = null;
    @Before
    public void initApplicationContext(){
        applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    }


    @Test
    public void test() {
        System.out.println("test....");
        printBeans(applicationContext);
//        Object person = applicationContext.getBean("person");
//        System.out.println(person);
        Map<String, Color> beansOfType = applicationContext.getBeansOfType(Color.class);
        System.out.println(beansOfType);
    }
    private void printBeans(ApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name :names){
            System.out.println(name);
        }
    }
}
