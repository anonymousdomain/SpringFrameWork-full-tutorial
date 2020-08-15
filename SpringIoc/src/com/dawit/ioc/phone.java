package com.dawit.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class phone {

	
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	   

		ApplicationContext  Context ;
		Context=new ClassPathXmlApplicationContext("beans.xml");
		SIM sim = Context.getBean("sim", SIM.class);
		sim.calling();
		sim.data();
		}
	}
