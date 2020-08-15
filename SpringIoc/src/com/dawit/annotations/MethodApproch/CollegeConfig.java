package com.dawit.annotations.MethodApproch;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.dawit.annotations")
/*
 * if we configer a bean id inside a configration class as a method, we don't
 * need to use component scan annotation
 */

public class CollegeConfig {

	/*
	 * we can ovverride a bean name, example @Bean(name="college1")
	 * 
	 * @Bean(name="college1,college2,....")
	 *
	 */
	public Teacher TeacherBean() {
		
		return new PythonTeacher();
		
	}
	//@Bean
	public Principal principalBean() {

		return new Principal();
	}

	@Bean
	public College collegeBean() {
		College college = new College(principalBean());
        college.setTeacher(TeacherBean());
		return college;
	}
}
