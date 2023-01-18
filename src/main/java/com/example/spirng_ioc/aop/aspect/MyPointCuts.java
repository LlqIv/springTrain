package com.example.spirng_ioc.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* abc*() )")
    public void allGetMethods() {}

}
