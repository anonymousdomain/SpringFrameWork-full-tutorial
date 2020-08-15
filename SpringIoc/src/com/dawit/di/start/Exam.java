package com.dawit.di.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext Context = new ClassPathXmlApplicationContext("beanstart.xml");
		Student stu = Context.getBean("student", Student.class);
		stu.display();

	}

}
