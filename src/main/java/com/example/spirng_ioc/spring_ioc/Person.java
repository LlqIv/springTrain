package com.example.spirng_ioc.spring_ioc;

public class Person {

    private Pet pet;
    private String surname;
    private int age;

    public Person(Pet pet) {
        System.out.println("New Person was born");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet() {
        System.out.println("Voice, my pet!");
        pet.say();
    }

}
