package com.example.spirng_ioc.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.example.spirng_ioc.aop.aspect.MyPointCuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: catch Exception " +
                "after trying get book/magazine");
    }

}
