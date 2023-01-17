package com.example.spirng_ioc;

public class Cat implements Pet {

    public Cat() {
        System.out.println("New Cat was created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

}
