package com.dawit.InjectingLiteralValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext Context=new ClassPathXmlApplicationContext("beansLiteral.xml");
		
		New_Student student=Context.getBean("student",New_Student.class);

		student.display();
	}

}
 