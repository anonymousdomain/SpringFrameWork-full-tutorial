package com.dawit.annotations.autowireApproch;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JavaTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hello Students this is your java instructor rujrash kutrpali\n");

	}

}
