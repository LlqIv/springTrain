package com.example.spirng_ioc.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("Take book");
    }

    /*public void getBook(String bookName, String bookName2) {
        System.out.println("Take book " + bookName + " " + bookName2);
    }*/

    public void returnBook() {
        System.out.println("Returning book in Library");
    }

    public void addBook() {
        System.out.println("Add book in Library");
    }

    public void getMagazine() {
        System.out.println("Take magazine");
    }

    public void returnMagazine() {
        System.out.println("Return magazine in Library");
    }

    public void addMagazine() {
        System.out.println("Add magazine in Library");
    }

}
