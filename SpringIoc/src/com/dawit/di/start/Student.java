package com.dawit.di.start;

public class Student {
	private String StudentName;
	private int id;

	
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void display() {
		System.out.println("Student name:"+StudentName+" & the id is :"+id);
	}

}
