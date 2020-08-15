package com.dawit.ioc;

public class etc implements SIM {
   public etc() {
	   System.out.println("this is the etc constructor");
   }
	@Override
	public void calling() {

		System.out.println("calling using etc simcard");
	}

    public void data() {

		System.out.println("brows data using etc simcard");
	}

}
