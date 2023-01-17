package com.example.spirng_ioc.aop;


import org.springframework.stereotype.Component;

@Component
public class FakeLibrary {

    public void getBook(){
        System.out.println("fake take from fake library");
    }

}
