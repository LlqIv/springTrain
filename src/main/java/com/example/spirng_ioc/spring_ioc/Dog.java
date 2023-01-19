package com.example.spirng_ioc.spring_ioc;

public class Dog implements Pet {

    public Dog() {
        System.out.println("new Dog was created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

}
