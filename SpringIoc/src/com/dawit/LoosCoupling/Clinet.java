package com.dawit.LoosCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext Context=new ClassPathXmlApplicationContext("beansL.xml");
		Student st=Context.getBean("student",Student.class);
		
		st.Display();

	}

}
 