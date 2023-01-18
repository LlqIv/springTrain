package com.example.spirng_ioc.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ivan", 4, 8.8);
        Student st2 = new Student("Michail", 2, 9);
        Student st3 = new Student("Alla", 1, 7.9);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Inf from method get students");
        System.out.println(students);
        return students;
    }

}
