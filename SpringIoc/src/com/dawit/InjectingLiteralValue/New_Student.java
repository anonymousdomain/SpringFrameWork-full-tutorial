package com.dawit.InjectingLiteralValue;

import org.springframework.beans.factory.annotation.Value;


public class New_Student {

	private String Name;
	private String InterestedCourse;
	private String Hobby;

	public String getName() {
		return Name;
	}
	    
      @Value("${New_Student.Name}")
	public void setName(String name) {
		Name = name;
	}

	public String getInterestedCourse() {
		return InterestedCourse;
	}
      @Value("${New_Student.InterestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		InterestedCourse = interestedCourse;
	}

	public String getHobby() {
		return Hobby;
	}
      @Value("${New_Student.Hobby}")
	public void setHobby(String hobby) {
		Hobby = hobby;
	}
	public void display() {
		System.out.println("student name:"+Name);
		System.out.println("InterestedCourse:"+InterestedCourse);
		System.out.println("Hobby:"+Hobby);

	}

}
