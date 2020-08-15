package com.dawit.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		ApplicationContext Context=new ClassPathXmlApplicationContext("BeansAutoWire.xml");
		Human dawit=Context.getBean("Human",Human.class);
		dawit.StartPumping();
	}

}
