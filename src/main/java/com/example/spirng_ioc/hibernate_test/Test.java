package com.example.spirng_ioc.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
    public static void main(String[] args) {

        Employees em = new Employees("aa", "bb", "qweq", 11);

        try (SessionFactory sessionFactory = Util.getSessionFactory();
            Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(em);
            session.getTransaction().commit();
        }

    }
}
