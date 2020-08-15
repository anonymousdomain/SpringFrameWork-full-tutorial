package com.dawit.annotations.autowireApproch;

import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "com.dawit.annotations")
/*
 * if we configer a bean id inside a configration class as a method, we don't
 * need to use component scan annotation
 */
@Configuration
@ComponentScan(basePackages = "com.dawit.annotations.autowireApproch")
public class CollegeConfig {

}
