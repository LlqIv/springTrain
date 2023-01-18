package com.example.spirng_ioc.aop.aspect;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents() )")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: Logging of getting list of students before method");
    }

    @AfterReturning("execution(* getStudents() )")
    public void afterReturningGetStudentsLoggingAdvice() {
        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging of getting list of students after method");
    }

}
