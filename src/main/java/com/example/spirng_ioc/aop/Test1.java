package com.example.spirng_ioc.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        Book book = context.getBean("book", Book.class);
        library.getBook();
        library.getMagazine();
        library.addBook();

//        FakeLibrary fakeLibrary = context.getBean("fakeLibrary", FakeLibrary.class);
//        fakeLibrary.getBook();


        context.close();



    }
}
