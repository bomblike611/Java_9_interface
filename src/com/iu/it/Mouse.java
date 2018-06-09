package com.iu.it;

public class Mouse implements USB{

	@Override
	public void go() {
		
	}
	
	public void leftClick() {
		System.out.println("좌클릭");
	}
	
	public void lightClick() {
		System.out.println("우클릭");
	}
	
}
