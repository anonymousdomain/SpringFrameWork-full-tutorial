package com.dawit.Annotation.autowire;

public class Heart {
	private String NameOfAnimal;
	private int NoOfHeart;
	
	public String getNameOfAnimal() {
		return NameOfAnimal;
	}
	public int getNoOfHeart() {
		return NoOfHeart;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		NameOfAnimal = nameOfAnimal;
	}
	public void setNoOfHeart(int noOfHeart) {
		NoOfHeart = noOfHeart;
	}

	public void pump() {
		
	System.out.println("you are good your heart is pumping");
	}

}
