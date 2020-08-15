package com.dawit.Annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanHeart")

	private Heart heart;

	public Human() {

	}

	public Human(Heart heart) {

		this.heart = heart;
	}

	public void StartPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println(
					"name of animal is:" + heart.getNameOfAnimal() + "\n no of heart is:" + heart.getNoOfHeart());
		} else {
			System.out.println(" bro you are dead ");
		}
	}
}
