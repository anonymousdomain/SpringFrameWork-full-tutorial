package com.dawit.LoosCouplingTry;

public class EthioTelecom {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void ActiveService() {
		service.service();
	}
}
