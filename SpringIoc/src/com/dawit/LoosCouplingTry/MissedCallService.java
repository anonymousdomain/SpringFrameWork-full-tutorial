package com.dawit.LoosCouplingTry;

public class MissedCallService implements Service {
   private String str;
   
	public void setStr(String str) {
	this.str = str;
}
	

	public String getStr() {
		return str;
	}


	@Override
	public void service() {
		
		if(str.equalsIgnoreCase("yes")) {
			
		System.out.println("you missed call service started thnkas for choosing ethio telcom");
		}
		
		else
			System.out.println("service dactivated");
		}
	}
