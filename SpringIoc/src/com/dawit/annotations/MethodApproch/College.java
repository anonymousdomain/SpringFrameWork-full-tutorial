package com.dawit.annotations.MethodApproch;

/*if u do not provide bean name in componenet then the class name will be bean name by defualt
 * @Component 
 * @Component("bean_name") 
 */
public class College {
	
private Principal principal;

private Teacher teacher;

	public void setPrincipal(Principal principal) {
	this.principal = principal;
}


public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}


	public College(Principal principal) {
	
	this.principal = principal;
	System.out.println("constructor called\n");
}


	public void test() {
	
		principal.PrincipalInfo();
		System.out.println("Debrebrhan university college of enginnering\n");
		
		teacher.teach();
	}

}
