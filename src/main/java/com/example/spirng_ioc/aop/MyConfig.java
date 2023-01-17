package com.example.spirng_ioc.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.spirng_ioc.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
