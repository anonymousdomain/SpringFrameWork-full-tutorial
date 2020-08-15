package com.dawit.odi;

public class Student1 {
private String CheatCourse;
private MatCheat Cheat;

public Student1() {
	System.out.println("mat-cheat constructor called");
}

public void setCheatCourse(String cheatCourse) {
	CheatCourse = cheatCourse;
}


public void setCheat(MatCheat cheat) {
	Cheat = cheat;
}


public void Display() {
	System.out.println("cheating course is :"+CheatCourse);
	Cheat.cheatwork();

}
	
}
