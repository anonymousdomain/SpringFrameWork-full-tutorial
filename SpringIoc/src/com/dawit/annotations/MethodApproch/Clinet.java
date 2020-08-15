package com.dawit.annotations.MethodApproch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Clinet {

	// @SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		College student = context.getBean("collegeBean", College.class);

		student.test();
		context.close();

	}

}
