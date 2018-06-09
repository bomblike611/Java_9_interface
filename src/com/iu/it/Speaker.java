package com.iu.it;

public class Speaker implements USB{

	@Override
	public void go() {
		this.sound();	
	}

	public void sound() {
		System.out.println("쿵짝쿵짝!");
	}
}
