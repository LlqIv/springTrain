package com.example.spirng_ioc.spring_ioc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigClass {

    @Bean
    public Pet myCat() {
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Pet myDog() {
        return new Dog();
    }

    @Bean
    public Person myPerson() {
        return new Person(myCat());
    }
}
