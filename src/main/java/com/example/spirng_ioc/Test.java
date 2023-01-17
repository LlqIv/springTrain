package com.example.spirng_ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Pet cat1 = context.getBean("myCat", Pet.class);
        Pet cat2 = context.getBean("myCat", Pet.class);

        System.out.println(cat1 == cat2);
        cat1.say();

        Dog dog1 = context.getBean("myDog", Dog.class);
        Dog dog2 = context.getBean("myDog", Dog.class);

        System.out.println("Equals links? " + (dog1 == dog2));

        Person person =  context.getBean("myPerson", Person.class);
        person.callPet();
    }
}
