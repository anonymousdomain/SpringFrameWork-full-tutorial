package com.dawit.annotations.autowireApproch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Clinet {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		College student = context.getBean("college", College.class);

		student.test();
		context.close();

	}

}
