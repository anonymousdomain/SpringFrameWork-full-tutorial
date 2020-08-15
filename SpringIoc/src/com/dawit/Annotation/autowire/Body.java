package com.dawit.Annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		ApplicationContext Context=new ClassPathXmlApplicationContext("BeansAnnotation.xml");
		Human dawit=Context.getBean("Human",Human.class);
		dawit.StartPumping();
	}

}
