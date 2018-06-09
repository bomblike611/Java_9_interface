package com.iu.it;

public class Charge implements USB{

	public void go() {
		this.charge();
	}
	
	public void charge() {
		System.out.println("충전 중");
	}
	
}
