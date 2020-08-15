package com.dawit.odi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clinet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext Context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student1 stu=Context.getBean("student",Student1.class);
		stu.Display();
		Student2 stu2=Context.getBean("student2",Student2.class);
		stu2.display();

	}

}
