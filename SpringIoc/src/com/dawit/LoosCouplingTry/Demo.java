package com.dawit.LoosCouplingTry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Demo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
ApplicationContext Context=new ClassPathXmlApplicationContext("beansL.xml");

EthioTelecom ETC=Context.getBean("telecom",EthioTelecom.class);
ETC.ActiveService();
	}

}
