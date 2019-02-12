package com.itrjp.config;

import com.itrjp.bean.Dog;
import com.itrjp.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.itrjp.bean")
public class AnnotationConfig {

    @Bean
    public Person person(){

        return new Person("zhangsan",18);
    }
    @Bean
    public Dog dog(){
        return new Dog("red","wangcai");
    }
}
