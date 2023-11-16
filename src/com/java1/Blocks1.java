package com.java1;

public class Blocks1 {
	
	{
		System.out.println("parent instance block");
	}
	
	static {
		System.out.println("parent static block");
	}
	
	public Blocks1() {
		System.out.println("parent constructor");
	}

}
