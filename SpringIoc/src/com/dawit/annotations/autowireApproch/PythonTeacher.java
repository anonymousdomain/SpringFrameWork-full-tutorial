package com.dawit.annotations.autowireApproch;

import org.springframework.stereotype.Component;

@Component
public class PythonTeacher implements Teacher {

	@Override
	public void teach() {
		
        System.out.println("python is so cool don't compare it with other programing");
	}

}
