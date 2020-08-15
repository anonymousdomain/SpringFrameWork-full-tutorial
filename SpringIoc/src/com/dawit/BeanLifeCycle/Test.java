package com.dawit.BeanLifeCycle;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("JdbcBean.xml");

		StudentDAO stu = context.getBean("student", StudentDAO.class);

		stu.SelectRow();
		System.out.println();

		// stu.deletedStudentRecored(6);
		context.close();
	}

}
